package org.example;

import org.example.dao.VehiculoDAO;

public class Main {

    public static void main(String[] args) {

        VehiculoDAO dao = new VehiculoDAO();

        boolean eliminado = dao.eliminar("ABC124");

        if (eliminado) {
            System.out.println("Vehículo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el vehículo.");
        }

        dao.listar();
    }
}