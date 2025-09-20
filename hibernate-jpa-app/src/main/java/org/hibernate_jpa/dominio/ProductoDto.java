package org.hibernate_jpa.dominio;

public class ProductoDto {
    //Atributos
    private String nombre;
    private Double precio;

    //Constructor
    public ProductoDto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
