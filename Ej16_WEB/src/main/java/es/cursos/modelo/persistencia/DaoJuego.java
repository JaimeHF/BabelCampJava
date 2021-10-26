package es.cursos.modelo.persistencia;

import es.cursos.modelo.entidad.Juego;

import java.util.ArrayList;
import java.util.List;

public class DaoJuego {
    public DaoJuego() {
    }
    Juego j1=new Juego(1,"Call of Duty","Activision",7,"https://www.callofduty.com/es/");
    Juego j2=new Juego(2,"FIFA","EA",7,"https://www.ea.com/es-es/games/fifa/fifa-22");
    Juego j3=new Juego(3,"NBA2K","Visual Concepls",8,"https://www.ea.com/es-es/games/fifa/fifa-22");



    public List<Juego> listar(){
        List<Juego> listaJuego=new ArrayList<>();
        listaJuego.add(j1);
        listaJuego.add(j2);
        listaJuego.add(j3);

        return listaJuego;
    }

    public Juego obtener(int id){
        switch (id){
            case 1:
               return j1;
            case 2:
                return j2;
            case 3:
                return j3;
            default:return null;
        }

    }
}
