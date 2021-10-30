package modelo.persistencia.interfaces;
import modelo.entidad.Coche;

import java.util.List;

public interface DAOCoche {

    boolean newCar(Coche c1);
    boolean deleteCar(int id);
    boolean updateCar(Coche c1);
    Coche obtener(int id);
    List<Coche> listCar();
}
