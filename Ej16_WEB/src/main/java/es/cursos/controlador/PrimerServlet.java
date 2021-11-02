package es.cursos.controlador;

import es.cursos.modelo.entidad.Juego;
import es.cursos.modelo.negocio.GestorJuego;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listaJuegos")
public class PrimerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PrimerServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        GestorJuego gj = new GestorJuego();
        List<Juego> listaJuegos = gj.listar();
        System.out.println(listaJuegos);
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        // //Podemos pasarle a la vista toda la informacion que queramos
        // //mediante atributos clave-valor (Map)
        request.setAttribute("lista", listaJuegos);
        System.out.printf(user, password);

        // //Le decimos al servlet que vista queremos elegir
        if (user.equals("paco") && password.equals("1234")) {
            request.getRequestDispatcher("listaJuegos.jsp").forward(request, response);
        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
