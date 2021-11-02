package curso.modelo.negocio;

import curso.modelo.entidades.Cliente;
import curso.modelo.entidades.Pedido;
import curso.modelo.persistencia.DAOcliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestorCliente {

    @Autowired
    DAOcliente daoCliente;

    public int insertar(Cliente c) {
        return daoCliente.insetarCliente(c);
    }

    public int borrar(int id) {
        return daoCliente.borrarCliente(id);
    }

    public int modificar(Cliente c, int id) {
        return daoCliente.modificarCliente(c, id);
    }

    public Cliente obtener(int id) {
        return daoCliente.obtenerCliente(id);
    }

    public List<Pedido> listarPedidosDeClientes(int id) {
        return daoCliente.listPedido(id);
    }

    public List<Cliente> listarCliente() {
        return daoCliente.listarCleinte();
    }

}
