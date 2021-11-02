import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost:3308/ej03cochecrud";
        String user = "root";
        String pass = "1234";

        try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);) {
            PreparedStatement sentencia = con.prepareStatement("SELECT * FROM coche");
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {//preguntamos si hay mas filas
                System.out.print(rs.getInt("IDcoche"));
                System.out.print(" - ");
                System.out.print(rs.getString("Marca"));
                System.out.print(" - ");
                System.out.print(rs.getString("Modelo"));
                System.out.print(" - ");
                System.out.print(rs.getInt("Km"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Error al realizar el listado de productos");
            System.out.println(e.getMessage());
        }
    }
}
