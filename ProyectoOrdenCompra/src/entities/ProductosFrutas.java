package entities;

import entities.abstractas.Producto;

public class ProductosFrutas extends Producto {
    //Constructor con super
    public ProductosFrutas(String fabricante, String nombre, int precio) {
        super(fabricante, nombre, precio);
    }

    //Metodo de clase padre
    @Override
    public String getTipo() {
        return "Frutas organicas";
    }

}
