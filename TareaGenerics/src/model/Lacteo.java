package model;

public class Lacteo extends Producto {
    //Atributos
    private int cantidad;
    private int proteinas;

    //Constructor
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    //Getters
    public int getCantidad() {
        return cantidad;
    }
    public int getProteinas() {
        return proteinas;
    }
}
