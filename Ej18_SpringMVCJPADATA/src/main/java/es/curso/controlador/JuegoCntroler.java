package es.curso.controlador;

import es.curso.modelo.entidad.Juego;
import es.curso.modelo.service.JuegoService;
import es.curso.modelo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JuegoCntroler {

    @Autowired
    private JuegoService js;

    @GetMapping("listar_videojuegos")
    public String displayVideojuegos(Model model) {

        if(!LoginService.isAccess()) {
            return "redirect:login";

        } else {

            List<Juego> listVideojuegos = js.findAll();
            model.addAttribute("listado", listVideojuegos);

            return "listar_videojuegos";
        }
    }

    @RequestMapping(path="videojuego_detalle",method= RequestMethod.GET)
    public String videojuegoDetalle(@RequestParam("id") String id, Model model) {

        if(!LoginService.isAccess()) {
            return "redirect:login";

        } else {
            int idNum = Integer.parseInt(id);
            Juego v = js.findOne(idNum);

            if(v != null) {
                model.addAttribute("game", v);
                return "videojuego_detalle";

            } else {
                model.addAttribute("error", "No existe ese ID");
                return "redirect:listar_videojuegos";
            }
        }
    }
}
