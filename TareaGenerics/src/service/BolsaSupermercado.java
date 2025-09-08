package service;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    //Atributos
    private List<T> productos;
    private final int max = 5;

    //Constructor
    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    //Metodos
    public void addProducto(T producto) {
        if (productos.size() < max) {
            productos.add(producto);
        } else {
            System.out.println("Ya no se pueden agregar mas prductos");
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}
