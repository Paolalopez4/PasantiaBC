package model;

import java.util.Date;

public class Vuelo {
    //Atributos
    private String nombre;
    private String origen;
    private String destino;
    private Date fecha;
    private int cantidadPasajeros;

    //Constructor
    public Vuelo(String nombre, String origen, String destino, Date fecha, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }
}
