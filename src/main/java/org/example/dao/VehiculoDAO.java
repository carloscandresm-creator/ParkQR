package org.example.dao;

import org.example.conexion.ConexionBD;
import org.example.modelo.Vehiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehiculoDAO {

    public boolean insertar(Vehiculo vehiculo) {

        String sql = "INSERT INTO vehiculo " +
                "(placa, tipo, marca, modelo, color, id_apartamento) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, vehiculo.getPlaca());
            sentencia.setString(2, vehiculo.getTipoVehiculo());
            sentencia.setString(3, vehiculo.getMarca());
            sentencia.setString(4, vehiculo.getModelo());
            sentencia.setString(5, vehiculo.getColor());
            sentencia.setInt(6, vehiculo.getIdApartamento());

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar vehículo: " + e.getMessage());
            return false;
        }
    }

    public void listar() {

        String sql = "SELECT * FROM vehiculo";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             java.sql.ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                System.out.println("ID: " + resultado.getInt("id_vehiculo"));
                System.out.println("Placa: " + resultado.getString("placa"));
                System.out.println("Tipo: " + resultado.getString("tipo"));
                System.out.println("Marca: " + resultado.getString("marca"));
                System.out.println("Modelo: " + resultado.getString("modelo"));
                System.out.println("Color: " + resultado.getString("color"));
                System.out.println("Apartamento: " + resultado.getInt("id_apartamento"));
                System.out.println("----------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar vehículos: " + e.getMessage());
        }
    }

    public boolean actualizar(Vehiculo vehiculo) {

        String sql = "UPDATE vehiculo SET tipo = ?, marca = ?, modelo = ?, color = ?, id_apartamento = ? " +
                "WHERE placa = ?";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, vehiculo.getTipoVehiculo());
            sentencia.setString(2, vehiculo.getMarca());
            sentencia.setString(3, vehiculo.getModelo());
            sentencia.setString(4, vehiculo.getColor());
            sentencia.setInt(5, vehiculo.getIdApartamento());
            sentencia.setString(6, vehiculo.getPlaca());

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar vehículo: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String placa) {

        String sql = "DELETE FROM vehiculo WHERE placa = ?";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, placa);

            return sentencia.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar vehículo: " + e.getMessage());
            return false;
        }
    }
}