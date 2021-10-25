package curso.modelo.persistencia;

import curso.modelo.entidades.Cliente;
import curso.modelo.entidades.Pedido;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class DAOclienteRowMapper  implements RowMapper<Cliente> {


    @Override
    public Cliente mapRow(ResultSet rs, int i) throws SQLException {
        Cliente c=new Cliente();
        c.setId(rs.getInt("id"));
        c.setNombre(rs.getString("nombre"));
        c.setEdad(rs.getInt("edad"));
        //c.setListPedido((List<Pedido>) rs.getArray("listaPedidos"));
        return c;
    }
}
