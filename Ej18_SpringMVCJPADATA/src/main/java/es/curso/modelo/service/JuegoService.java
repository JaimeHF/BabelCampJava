package es.curso.modelo.service;

import es.curso.modelo.entidad.Juego;
import es.curso.modelo.repository.VideojuegoRepositoryJPAData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JuegoService {
    @Autowired
    private VideojuegoRepositoryJPAData videojuegoRepositoryJPAData;

    @Transactional
    public Juego findOne(int id) {
        return videojuegoRepositoryJPAData.findById(id).orElse(null);
    }

    public List<Juego> findAll() {
        return videojuegoRepositoryJPAData.findAll();
    }
}
