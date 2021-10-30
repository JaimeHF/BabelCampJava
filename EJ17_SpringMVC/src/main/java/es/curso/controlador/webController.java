package es.curso.controlador;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.curso.modelo.entidad.Juego;
import es.curso.modelo.negocio.GestorJuego;




@Controller
public class webController {

	@Autowired
	private GestorJuego gj;
	
	
	@GetMapping("home")
	public String mostrarLogin() {
		return "home";
	}
	
	
	
	@PostMapping("login")
	public ModelAndView  login(@RequestParam("username")String user,
			@RequestParam("password") String pass,
			HttpServletRequest request,
			HttpServletResponse response,
			ModelAndView mav) {
		
		
		if(user.equals("paco")&&pass.equals("1234")) {
			List<Juego> listaJuegos = gj.listar();
			mav.addObject("lista", listaJuegos);
			mav.setViewName("listadoVideoJuegos");
			mav.setViewName("listaJuegos");
			 
		}else {
			
			mav.setViewName("home");;
		}
		return mav;
	}
	
	@PostMapping("juegoDetalle")
	public ModelAndView detalleJuego(@RequestParam("id") int id,
			ModelAndView mav) {
		
			Juego j = gj.obtener(id);
			if(j !=null) {
				mav.addObject("j",j);
				mav.setViewName("juegoDetalle");
				
			}else {
				mav.setViewName("listaJuegos");
			}
		return mav;
	}
}
