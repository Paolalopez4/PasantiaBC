package main;

import model.Fruta;
import model.Lacteo;
import model.Limpieza;
import model.NoPerecible;
import service.BolsaSupermercado;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------PRODUCTOS EN BOLSA DE FRUTAS----------");
        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        bolsaFruta.addProducto(new Fruta("Manzana", 1.50, 1.00, "Rojo"));
        bolsaFruta.addProducto(new Fruta("Pera", 1.75, 0.80, "Verde"));
        bolsaFruta.addProducto(new Fruta("Sandia", 3.00, 5.00, "Verde"));
        bolsaFruta.addProducto(new Fruta("Melon", 2.00, 3.00, "Verde"));
        bolsaFruta.addProducto(new Fruta("Fresa", 2.50, 3.00, "Rojo"));
        for (Fruta fruta : bolsaFruta.getProductos()) {
            System.out.println("\nFruta:\n" + "Nombre: " + fruta.getNombre() + "\nPrecio: " + fruta.getPrecio() + "\nPeso: " + fruta.getPeso() + "\nColor: " + fruta.getColor());
        }

        System.out.println("\n----------PRODUCTOS EN BOLSA DE LACTEOS----------");
        BolsaSupermercado<Lacteo> bolsaLacteo =  new BolsaSupermercado<>();
        bolsaLacteo.addProducto(new Lacteo("Leche", 1.50, 4, 30));
        bolsaLacteo.addProducto(new Lacteo("Mantequilla", 2.00, 5, 5));
        bolsaLacteo.addProducto(new Lacteo("Queso", 2.50, 1, 10));
        bolsaLacteo.addProducto(new Lacteo("Yogurt", 4.00, 6, 50));
        bolsaLacteo.addProducto(new Lacteo("Crema", 1.00, 1, 5));
        for (Lacteo lacteo : bolsaLacteo.getProductos()) {
            System.out.println("\nLacteo:\n" + "Nombre: " + lacteo.getNombre() + "\nPrecio: " + lacteo.getPrecio() + "\nCantidad: " + lacteo.getCantidad() + "\nProteinas: " + lacteo.getProteinas());
        }

        System.out.println("\n----------PRODUCTOS EN BOLSA DE LIMPIEZA----------");
        BolsaSupermercado<Limpieza> bolsaLimpieza =  new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Jabon", 5.00, "Fragancia", 2.00));
        bolsaLimpieza.addProducto(new Limpieza("Suavizante", 7.00, "Fragancia", 3.00));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 3.00, "Colorante", 1.00));
        bolsaLimpieza.addProducto(new Limpieza("Limpiador de baño", 2.00, "Cloro", 2.00));
        bolsaLimpieza.addProducto(new Limpieza("Limpia vidrios", 3.00, "Alcohol isopropilico", 2.00));
        for (Limpieza limpieza : bolsaLimpieza.getProductos()) {
            System.out.println("\nLimpieza:\n" + "Nombre: " + limpieza.getNombre() + "\nPrecio: " + limpieza.getPrecio() + "\nComponentes: " + limpieza.getComponentes() + "\nLitros: " + limpieza.getLitros());
        }

        System.out.println("\n----------PRODUCTOS EN BOLSA DE NO PERECIBLES----------");
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();
        bolsaNoPerecible.addProducto(new NoPerecible("Arroz", 1.00, 1000, 2000));
        bolsaNoPerecible.addProducto(new NoPerecible("Frijoles", 1.00, 1000, 1000));
        bolsaNoPerecible.addProducto(new NoPerecible("Azucar", 1.50, 2000, 6000));
        bolsaNoPerecible.addProducto(new NoPerecible("Pasta", 2.75, 500, 1500));
        bolsaNoPerecible.addProducto(new NoPerecible("Harina", 1.30, 1000, 2000));
        for (NoPerecible noPerecible : bolsaNoPerecible.getProductos()) {
            System.out.println("\nNo Perecible:\n" + "Nombre: " + noPerecible.getNombre() + "\nPrecio: " + noPerecible.getPrecio() + "\nContenido: " + noPerecible.getContenido() + "\nCalorias: " + noPerecible.getCalorias());
        }
    }
}