package es.cursos.modelo.negocio;

import es.cursos.modelo.entidad.Juego;
import es.cursos.modelo.persistencia.DaoJuego;

import java.util.List;

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
