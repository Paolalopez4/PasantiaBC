package entities;

import entities.abstractas.Producto;

public class ProductosLacteos extends Producto {
    //Constructor con super
    public ProductosLacteos(String fabricante, String nombre, int precio) {
        super(fabricante, nombre, precio);
    }

    //Metodo de clase padre
    @Override
    public String getTipo() {
        return "Lacteos frescos";
    }
}
