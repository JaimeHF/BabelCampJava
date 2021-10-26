package curso.modelo.negocio;

import curso.modelo.persistencia.DAOcliente;
import curso.modelo.persistencia.DAOpedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestorPedido {

    @Autowired
    DAOpedido daoPedido;

}
