package model;

public class Fruta extends Producto {
    //Atributos
    private double peso;
    private String color;

    //Constructor
    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    //Getters
    public double getPeso() {
        return peso;
    }
    public String getColor() {
        return color;
    }
}
