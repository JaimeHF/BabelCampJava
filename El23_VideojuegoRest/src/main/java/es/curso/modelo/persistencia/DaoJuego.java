package es.curso.modelo.persistencia;

import es.curso.modelo.entidad.Juego;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoJuego {

    public List<Juego> listaJuegos;

    public DaoJuego(){
        System.out.println("DaoJuego --> Creando lista de jeugos");
        listaJuegos=new ArrayList<Juego>();
        Juego j1=new Juego(1,"FIFA 5000","EA",7,80);
        Juego j2=new Juego(2,"Call of duty","ACTIVISION",7,60);
        Juego j3=new Juego(3,"ASSASIN´S CRED","Ubisoft",7,60);
        Juego j4=new Juego(4,"NBA 2K","2K Games",7,40);
        Juego j5=new Juego(5,"Gran turismo","SONY",7,100);
        listaJuegos.add(j1);
        listaJuegos.add(j2);
        listaJuegos.add(j3);
        listaJuegos.add(j4);
        listaJuegos.add(j5);
    }

    public Juego get(int id){
        try {
            return listaJuegos.get(id);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Juego fuera de rango");
            return null;
        }
    }

    public void add(Juego j){
        j.setId(listaJuegos.size()+1);
        listaJuegos.add(j);
    }

    public Juego delete(int id){
        try {
            return listaJuegos.remove(id);
        } catch (Exception e) {
            System.out.println("delete -> Juego fuera de rango");
            return null;
        }
    }

    public Juego update(Juego j){
        try {
            Juego jAux = listaJuegos.get(j.getId());
            if(jAux != null) {
                jAux.setNombre(j.getNombre());
                jAux.setCompania(j.getCompania());
                jAux.setNota(j.getNota());
                jAux.setPrecio(j.getPrecio());
            }
            return jAux;
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("update -> Juego fuera de rango");
            return null;
        }
    }

    public List<Juego> list(){
        return listaJuegos;
    }

    public List<Juego> listByName(String nombre){
        List<Juego> listaJuegoAux = new ArrayList<Juego>();
        for(Juego j : listaJuegos) {
            if(j.getNombre().equalsIgnoreCase(nombre)) {
                listaJuegoAux.add(j);
            }
        }
        return listaJuegoAux;
    }
    public List<Juego> listByCompani(String compani){
        List<Juego> listaJuegoAux = new ArrayList<Juego>();
        for(Juego j : listaJuegos) {
            if(j.getCompania().equalsIgnoreCase(compani)) {
                listaJuegoAux.add(j);
            }
        }
        return listaJuegoAux;
    }

    public List<String> precios(){
        List<String> listaJuegoAux = new ArrayList<String>();
        double total=0;
        String text="";

        for(Juego j: listaJuegos ){
            text="Juego "+j.getNombre() +" precio: "+j.getPrecio()+"€";
            total+=j.getPrecio();
            listaJuegoAux.add(text);
        }
        text="Precio total de los juegos: "+total+"€";
       listaJuegoAux.add(text);

        return listaJuegoAux;
    }


}
