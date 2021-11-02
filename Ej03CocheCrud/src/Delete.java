import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost:3308/ej03cochecrud";
        String user = "root";
        String pass = "1234";

        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);) {
            String sql = "DELETE FROM coche WHERE IDcoche=?";

            int id = 2;

            System.out.println("SQL:");
            System.out.println(sql);

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, id);

            int afectados = sentencia.executeUpdate();
            System.out.println("Sentencia SQL ejecutada con éxito");
            System.out.println("Registros afectados: " + afectados);
        } catch (SQLException e) {
            System.out.println("Error al borrar el cliente");
            System.out.println(e.getMessage());
        }
    }

}
