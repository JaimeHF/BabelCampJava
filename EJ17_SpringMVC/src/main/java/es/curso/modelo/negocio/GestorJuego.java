package es.curso.modelo.negocio;

import java.util.List;

import org.springframework.stereotype.Component;

import es.curso.modelo.entidad.Juego;
import es.curso.modelo.persistencia.DaoJuego;

@Component
public class GestorJuego {

	private DaoJuego juegoDao;
    public List<Juego> listar(){
        juegoDao=new DaoJuego();
        return juegoDao.listar();
    }

    public Juego obtener(int id){
        juegoDao =new DaoJuego();
        return juegoDao.obtener(id);
    }
}
