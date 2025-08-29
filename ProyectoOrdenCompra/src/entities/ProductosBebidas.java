package entities;

import entities.abstractas.Producto;

public class ProductosBebidas extends Producto {
    //Constructor con super
    public ProductosBebidas(String fabricante, String nombre, int precio) {
        super(fabricante, nombre, precio);
    }

    //Metodo de clase padre
    @Override
    public String getTipo() {
        return "Bebidas en lata";
    }
}
