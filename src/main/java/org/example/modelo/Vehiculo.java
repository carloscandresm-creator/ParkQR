package org.example.modelo;

public class Vehiculo {

    private int idVehiculo;
    private String placa;
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private int idApartamento;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String placa, String tipoVehiculo,
                    String marca, String modelo, String color,
                    int idApartamento) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.idApartamento = idApartamento;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this.idApartamento = idApartamento;
    }
}