package es.curso.modelo.persistencia;


import es.curso.modelo.entidad.Coche;
import es.curso.modelo.persistencia.interfaces.DAOCoche;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CocheDao implements DAOCoche {

    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean newCar(Coche car) {
        em.persist(car);
        return true;
    }

    @Override
    public boolean deleteCar(String matricula) {
        Coche car = em.find(Coche.class, matricula);
        em.refresh(car);
        return true;
    }

    @Override
    public boolean updateCar(Coche car) {
        em.merge(car);
        return true;
    }

    @Override
    public Coche obtener(String matricula) {

        return em.find(Coche.class, matricula);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Coche> listCar() {

        List<Coche> listCoche = em.createQuery("from Coche c").getResultList();
        return listCoche;
    }
}
