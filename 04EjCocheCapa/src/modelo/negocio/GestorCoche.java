package modelo.negocio;

import modelo.entidad.Coche;
import modelo.persistencia.CocheDao;
import modelo.persistencia.interfaces.DAOCoche;

import java.util.List;

public class GestorCoche {

    DAOCoche carDao=new CocheDao();


    public boolean newCar(Coche c){
        boolean alta=false;
       if(c.getMatricula().length() == 7 && !c.getModelo().equals("")&& !c.getMarca().equals("")) {
            alta = carDao.newCar(c);
           return alta;
       }
        return alta;
    }

    public boolean deleteCar(int id){
        boolean baja = carDao.deleteCar(id);
        return baja;
    }

    public boolean updateCar(Coche c){
        boolean modificada=false;
        if(c.getMatricula().length() == 7 && !c.getModelo().equals("")&& !c.getMarca().equals("")){
             modificada = carDao.updateCar(c);
            return modificada;
        }
        return modificada;
    }

    public Coche  obtener(int id){
        Coche c = carDao.obtener(id);
        return c;
    }

    public List<Coche> listCar(){
        List<Coche> listaPersonas = carDao.listCar();
        return listaPersonas;
    }
}
