package curso.modelo.persistencia;

import curso.modelo.entidades.Pedido;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOpedidoRowMapper implements RowMapper<Pedido> {
    @Override
    public Pedido mapRow(ResultSet rs, int i) throws SQLException {
        Pedido p=new Pedido();
        p.setId(rs.getInt("id"));
        p.setImporte(rs.getInt("importe"));
        p.getFecha(rs.getDate("fecha"));
        return p;
    }
}
