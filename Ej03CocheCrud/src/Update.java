import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    public static void main(String[] args) {
        // Paso 1: Establecemos los parametros de conexión con la base de datos
        String cadenaConexion = "jdbc:mysql://localhost:3308/ej03cochecrud";
        String user = "root";
        String pass = "1234";

        // Paso 2: Interactuar con la BD
        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);) {
            String sql = "update coche set marca=?, modelo=?, km=? WHERE IDcoche=?";

            String marca = "Opel";
            String modelo = "Astra";
            int km = 150000;
            int id = 1;

            System.out.println("SQL:");
            System.out.println(sql);

            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setString(1, marca);
            sentencia.setString(2, modelo);
            sentencia.setInt(3, km);
            sentencia.setInt(4, id);

            int afectados = sentencia.executeUpdate();
            System.out.println("Sentencia SQL ejecutada con éxito");
            System.out.println("Registros afectados: " + afectados);
        } catch (SQLException e) {
            System.out.println("Error al añadir nuevo cliente");
            System.out.println(e.getMessage());
        }
    }
}
