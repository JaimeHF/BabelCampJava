package es.curso.modelo.repository;

import es.curso.modelo.entidad.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideojuegoRepositoryJPAData extends JpaRepository<Juego, Integer> {


}
