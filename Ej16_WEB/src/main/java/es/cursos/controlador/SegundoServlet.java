package es.cursos.controlador;

import es.cursos.modelo.entidad.Juego;
import es.cursos.modelo.negocio.GestorJuego;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/juegoDetalle")
public class SegundoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GestorJuego gj = new GestorJuego();

        String id = request.getParameter("id");

        int idNumerico = Integer.parseInt(id);

        Juego j = gj.obtener(idNumerico);

        if (j != null) {
            request.setAttribute("j", j);
            request.getRequestDispatcher("juegoDetalle.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("errorPelicula.jsp").forward(request, response);
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
