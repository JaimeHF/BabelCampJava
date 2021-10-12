import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Create {
    public static void main(String[] args) {

        String cadenaConexion = "jdbc:mysql://localhost:3308/ej03cochecrud";
        String user = "root";
        String pass = "1234";


        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
            String sql = "INSERT INTO coche (marca, modelo, km) VALUES (?, ?, ?)";

            String marca="Opel";
            String modelo="Astra";
            int km = 150000;

            System.out.println("SQL:");
            System.out.println(sql);

            PreparedStatement sentencia= con.prepareStatement(sql);

            sentencia.setString(1, marca);
            sentencia.setString(2, modelo);
            sentencia.setInt(3, km);

            int afectados = sentencia.executeUpdate();
            System.out.println("Sentencia SQL ejecutada con éxito");
            System.out.println("Registros afectados: "+afectados);

        } catch (SQLException e) {
            System.out.println("Error al añadir una nueva persona");
            System.out.println(e.getMessage());
        }

    }
}
