package app;

import entities.*;
import entities.abstractas.Producto;

import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploOrdenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creacion del cliente
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        Cliente cliente = new Cliente(nombre, apellido);
        OrdenCompra orden = new OrdenCompra("Orden del cliente");

        //Productos quemados
        Producto lacteo1 = new ProductosLacteos("Sula", "Leche Deslactosada", 2);
        Producto lacteo2 = new ProductosLacteos("Salud", "Crema", 1);
        Producto bebidas1 = new ProductosBebidas("Coca-Cola", "Coca-Cola", 1);
        Producto bebidas2 = new ProductosBebidas("PepsiCo", "Pepsi", 1);
        Producto frutas1 = new ProductosFrutas("Fresto", "Manzanas", 2);
        Producto frutas2 = new ProductosFrutas("Berrly", "Fresas", 3);

        //Creacion de orden del lado cliente
        int opcion;
        do {
            System.out.println("\n");
            System.out.println("Seleccione el producto que desea agregar a su orden: ");
            System.out.println("1. " + lacteo1.getNombre() + " $" + lacteo1.getPrecio());
            System.out.println("2. " + lacteo2.getNombre() + " $" + lacteo2.getPrecio());
            System.out.println("3. " + bebidas1.getNombre() + " $" + bebidas1.getPrecio());
            System.out.println("4. " + bebidas2.getNombre() + " $" + bebidas2.getPrecio());
            System.out.println("5. " + frutas1.getNombre() + " $" + frutas1.getPrecio());
            System.out.println("6. " + frutas2.getNombre() + " $" + frutas2.getPrecio());
            System.out.println("7. Finalizar orden.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> orden.addProducto(lacteo1);
                case 2 -> orden.addProducto(lacteo2);
                case 3 -> orden.addProducto(bebidas1);
                case 4 -> orden.addProducto(bebidas2);
                case 5 ->orden.addProducto(frutas1);
                case 6 -> orden.addProducto(frutas2);
                case 7 -> System.out.println("Orden finalizada.");
                default -> System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 7);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos en la orden:");
        for (Producto p : orden.getProductos()) {
            if (p != null) {
                System.out.println("- " + p.getNombre() + " $" + p.getPrecio());
            }
        }
        System.out.println("Total de la orden: $" + orden.calcularGranTotal());
    }
}