package entities.abstractas;

//Clase abstracta de producto para sacar diferentes tipos de productos de esta
public abstract class Producto {
    //Atributos
    private String fabricante;
    private String nombre;
    private int precio;

    //Constructor
    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getFabricante() {
        return fabricante;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }

    //Metodo adicional agregado para las subclases
    public abstract String getTipo();
}
