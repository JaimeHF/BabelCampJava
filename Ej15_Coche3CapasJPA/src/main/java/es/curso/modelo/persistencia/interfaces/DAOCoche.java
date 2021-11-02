package es.curso.modelo.persistencia.interfaces;

import es.curso.modelo.entidad.Coche;

import java.util.List;

public interface DAOCoche {

    boolean newCar(Coche c1);

    boolean deleteCar(String matricula);

    boolean updateCar(Coche c1);

    Coche obtener(String matricula);

    List<Coche> listCar();
}
