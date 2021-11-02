package modelo.entidad;

import modelo.persistencia.Movible;

public class Avion extends Vehiculo implements Movible {

    public Avion(int id, int cv, String nombre) {
        super(id, cv, nombre);
    }

    @Override
    public String mover(int metros) {
        double total = metros + (getCv() * 3);
        return "Se mueve por el aire " + total + " metros";
    }

}
