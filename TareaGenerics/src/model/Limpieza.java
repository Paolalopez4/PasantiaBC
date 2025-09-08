package model;

public class Limpieza extends Producto {
    //Atributos
    private String componentes;
    private double litros;

    //Constructor
    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    //Getters
    public String getComponentes() {
        return componentes;
    }
    public double getLitros() {
        return litros;
    }
}
