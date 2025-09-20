package org.hibernate_jpa;

import jakarta.persistence.EntityManager;
import org.hibernate_jpa.entity.Cliente;
import org.hibernate_jpa.entity.Producto;
import org.hibernate_jpa.util.JpaUtil;

import java.util.List;

public class HibernateQLProducto {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        System.out.println("=========== consultar todos ==========");
        List<Producto> productos = em.createQuery("select p from Producto p", Producto.class)
                .getResultList();
        productos.forEach(System.out::println);

        System.out.println("\n");

        System.out.println("=========== consulta por id ===========");
        Producto producto = em.createQuery("select p from Producto p where p.id=:id", Producto.class)
                .setParameter("id", 1L)
                .getSingleResult();
        System.out.println(producto);

        System.out.println("\n");

        System.out.println("========== consulta solo el nombre por el id ==========");
        String nombreProducto = em.createQuery("select p.nombre from Producto p where p.id=:id", String.class)
                .setParameter("id", 2L)
                .getSingleResult();
        System.out.println(nombreProducto);

        System.out.println("\n");

        System.out.println("========== consulta que puebla y devuelve objeto entity de una clase personalizada ==========");
        productos = em.createQuery("select new Producto(p.nombre, p.precio) from Producto p", Producto.class)
                .getResultList();
        productos.forEach(System.out::println);

        System.out.println("\n");

        System.out.println("========== consulta con nombres de clientes ===========");
        List<String> nombres = em.createQuery("select p.nombre from Producto p", String.class)
                .getResultList();
        nombres.forEach(System.out::println);

        em.close();
    }
}
