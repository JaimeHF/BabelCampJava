package es.curso.modelo.negocio;

import es.curso.modelo.entidad.Coche;
import es.curso.modelo.persistencia.CocheDao;
import es.curso.modelo.persistencia.interfaces.DAOCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GestorCoche {

    @Autowired
    private CocheDao carDao=new CocheDao();

    @Transactional
    public boolean newCar(Coche c){
            boolean alta = carDao.newCar(c);
            return alta;
    }
    @Transactional
    public boolean deleteCar(String matricula){
        boolean baja = carDao.deleteCar(matricula);
        return baja;
    }
    @Transactional
    public boolean updateCar(Coche c){
            boolean modif = carDao.updateCar(c);
            return modif;
    }

    public Coche obtener(String matricula){
        Coche c =carDao.obtener(matricula);
        return c;
    }

    public List<Coche> listCar(){
        List <Coche> lista = carDao.listCar();
        return lista;
    }
}
