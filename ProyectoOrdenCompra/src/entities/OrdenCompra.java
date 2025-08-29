package entities;

import entities.abstractas.Producto;

import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente clientes;
    private Producto[] productos = new Producto[4];

    //Contadores de ordenes y de productos
    private static int cantidadOrdenes = 0;
    private int cantidadProductos = 0;


    //Constructor con id autoincremental, descripcion, y array de 4 productos
    public OrdenCompra(String descripcion) {
        cantidadOrdenes++;
        this.id = cantidadOrdenes;
        this.descripcion = descripcion;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getClientes() {
        return clientes;
    }
    public Producto[] getProductos() {
        return productos;
    }
    public static int getCantidadOrdenes() {
        return cantidadOrdenes;
    }
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    //Setters
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    //Metodos
    public void addProducto(Producto producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("No se pueden agregar mas productos a la orden");
        }
    }

    public int calcularGranTotal() {
        int total = 0;
        for (Producto p : productos) {
            if (p != null) {
                total += p.getPrecio();
            }
        }
        return total;
    }
}
