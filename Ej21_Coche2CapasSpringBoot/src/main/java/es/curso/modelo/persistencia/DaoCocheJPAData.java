package es.curso.modelo.persistencia;

import es.curso.modelo.entidad.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DaoCocheJPAData extends JpaRepository<Coche, Integer> {
    boolean findByMatricula(String matricula);
}
