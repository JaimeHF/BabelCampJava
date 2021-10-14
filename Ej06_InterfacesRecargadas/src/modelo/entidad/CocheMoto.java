package modelo.entidad;

import modelo.persistencia.Movible;

public class CocheMoto extends Vehiculo implements Movible {

    public CocheMoto(int id, int cv, String nombre) {
        super(id, cv, nombre);
    }

}
