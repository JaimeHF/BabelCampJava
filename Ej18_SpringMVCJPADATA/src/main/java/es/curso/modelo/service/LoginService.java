package es.curso.modelo.service;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.repository.LoginRepositoryJPAData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginService {

    @Autowired
    private LoginRepositoryJPAData loginRepositoryJPAData;
    private static boolean access = false;

    @Transactional
    public boolean checkCredentials(String nombre, String pass) {
        Usuario u = loginRepositoryJPAData.findByNombre(nombre);

        if(u != null && u.getPass().equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAccess() {
        return access;
    }

    public static void setAccess(boolean access) {
        LoginService.access = access;
    }
}
