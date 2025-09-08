package model;

public class NoPerecible extends Producto {
    //Atributos
    private int contenido;
    private int calorias;

    //Constructor
    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    //Getters
    public int getContenido() {
        return contenido;
    }
    public int getCalorias() {
        return calorias;
    }
}
