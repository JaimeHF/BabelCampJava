package modelo.entidad;

import modelo.persistencia.Movible;

public class Barco extends Vehiculo implements Movible {
    public Barco(int id, int cv, String nombre) {
        super(id, cv, nombre);
    }



    @Override
    public String mover(int metros) {
        double total=metros+Math.pow(metros,2);
        return "Se mueve por el mar "+total+" metros";
    }
}
