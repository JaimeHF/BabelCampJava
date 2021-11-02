package curso.modelo.persistencia;

import curso.modelo.entidades.Cliente;
import curso.modelo.entidades.Pedido;

import java.util.List;

public interface DAOcliente {
    int insetarCliente(Cliente c);

    int borrarCliente(int id);

    int modificarCliente(Cliente c, int id);

    Cliente obtenerCliente(int id);

    List<Cliente> listarCleinte();

    int insetarPedido(Pedido p, int id);

    List<Pedido> listPedido(int id);
}
