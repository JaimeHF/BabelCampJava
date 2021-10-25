package curso.modelo.persistencia;

import curso.modelo.entidades.Cliente;
import curso.modelo.entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DAOclienteTemplate implements DAOcliente{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DAOclienteRowMapper clienteRowMapper;
    @Autowired
    private DAOpedidoRowMapper pedidoRowMapper;


    @Override
    public int insetarCliente(Cliente c) {
        String query = "insert into cliente ( Nombre, edad) values (?, ?)";
        int id=jdbcTemplate.update(query,c.getNombre(),c.getEdad());
        return id;
    }

    @Override
    public int borrarCliente(int id) {
        String query = "delete from cliente where id=?";
        return jdbcTemplate.update(query, id);
    }

    @Override
    public int modificarCliente(Cliente c,int id) {
        String query = "update cliente SET NOMBRE=?, EDAD=? where id=?";

        int id2 = jdbcTemplate.update(query, c.getNombre(), c.getEdad(), id);

        return id2;
    }

    @Override
    public Cliente obtenerCliente(int id) {
        String query = "select * from cliente where id=?";
        Cliente c = null;

        try {
            c = jdbcTemplate.queryForObject(query, clienteRowMapper, id);
        } catch (EmptyResultDataAccessException e) {

        }

        return c;
    }

    @Override
    public List<Cliente> listarCleinte() {
        String query = "select * from cliente";

        return (List<Cliente>) jdbcTemplate.query(query, clienteRowMapper);
    }

    @Override
    public int insetarPedido(Pedido p, int id) {
        String query = "insert into pedido (IMPORTE, FECHA, IDCLIENTE) values (?, ?, ?)";

        int otroId = jdbcTemplate.update(query, p.getImporte(), p.getFecha(), id);

        return otroId;
    }

    @Override
    public List<Pedido> listPedido(int id) {
        String query = "select * from pedido where idCliente=?";

        return (List<Pedido>) jdbcTemplate.query(query, pedidoRowMapper, id);
    }
}
