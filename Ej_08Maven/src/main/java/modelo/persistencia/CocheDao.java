package modelo.persistencia;


import modelo.entidad.Coche;
import modelo.persistencia.interfaces.DAOCoche;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDao implements DAOCoche {
    private Connection conexion;

    public boolean abrirConexion(){
        String url = "jdbc:mysql://localhost:3308/ej03cochecrud";
        String user = "root";
        String pass = "1234";

        try {
            conexion = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean cerrarConexion(){
        try {
            conexion.close();
        } catch ( SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean newCar(Coche car) {
        if(!abrirConexion()){
            return false;
        }

        boolean salida=true;
        String query = "insert into bbddcoches (marca,modelo,km,matricula) "
                + " values(?,?,?,?)";
        try {

            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, car.getMarca());
            ps.setString(2, car.getModelo());
            ps.setInt(3, car.getKm());
            ps.setString(4,car.getMatricula());

            int numeroFilasAfectadas = ps.executeUpdate();
            if(numeroFilasAfectadas == 0) {
                salida = false;
            }
        } catch (SQLException e) {
            System.out.println("alta -> Error al insertar: " + car);
            salida = false;
            e.printStackTrace();
        } finally{
            cerrarConexion();
        }
        cerrarConexion();
        return salida;
    }

    @Override
    public boolean deleteCar(int id) {
        if(!abrirConexion()){
            return false;
        }

        boolean borrado = true;
        String query = "delete from bbddcoches where id = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);

            int numeroFilasAfectadas = ps.executeUpdate();
            if(numeroFilasAfectadas == 0)
                borrado = false;
        } catch (SQLException e) {
            System.out.println("baja -> No se ha podido dar de baja el id " + id);
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return borrado;
    }

    @Override
    public boolean updateCar(Coche car) {
        if(!abrirConexion()){
            return false;
        }
        boolean modificado = true;
        String query = "update bbddcoches set marca=?, modelo=?, km=?, Matricula=? WHERE ID=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, car.getMarca());
            ps.setString(2, car.getModelo());
            ps.setInt(3, car.getKm());
            ps.setString(4,car.getMatricula());
            ps.setInt(5, car.getId());

            int numeroFilasAfectadas = ps.executeUpdate();
            if(numeroFilasAfectadas == 0){
                modificado = false;}

        } catch (SQLException e) {
            System.out.println("modificar -> error al modificar el coche " + car);
            modificado = false;
            e.printStackTrace();
        } finally{
            cerrarConexion();
        }
        return modificado;
    }

    @Override
    public Coche obtener(int id) {
        if(!abrirConexion()){
            return null;
        }
        Coche car = null;

        String query = "select ID,marca,modelo,km,Matricula from bbddcoches where id = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                car = new Coche();
                car.setId(rs.getInt(1));
                car.setMarca(rs.getString(2));
                car.setModelo(rs.getString(3));
                car.setKm(rs.getInt(4));
                car.setMatricula(rs.getString(5));
            }

        } catch (SQLException e) {
            System.out.println("obtener -> error al obtener el coche con id " + id);
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }

        return car;
    }

    @Override
    public List<Coche> listCar() {
        if(!abrirConexion()){
            return null;
        }
        List<Coche> listCar = new ArrayList<>();

        String query = "select ID,marca,modelo,km,Matricula from bbddcoches";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Coche car = new Coche();
                car.setId(rs.getInt(1));
                car.setMarca(rs.getString(2));
                car.setModelo(rs.getString(3));
                car.setKm(rs.getInt(4));
                car.setMatricula(rs.getString(5));

                listCar.add(car);
            }
        } catch (SQLException e) {
            System.out.println("listar -> error al obtener los coches");
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }

        return listCar;
    }
}
