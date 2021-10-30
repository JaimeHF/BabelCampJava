package es.curso.modelo.repository;

import es.curso.modelo.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositoryJPAData extends JpaRepository<Usuario, Integer> {

    public Usuario findByNombre(String nombre);

}
