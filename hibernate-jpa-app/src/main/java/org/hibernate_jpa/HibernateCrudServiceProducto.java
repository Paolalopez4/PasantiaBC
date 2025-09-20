package org.hibernate_jpa;

import jakarta.persistence.EntityManager;
import org.hibernate_jpa.entity.Producto;
import org.hibernate_jpa.services.ProductoService;
import org.hibernate_jpa.services.ProductoServiceImpl;
import org.hibernate_jpa.util.JpaUtil;

import java.util.List;
import java.util.Optional;

//CONSULTA DE PRUEBA EN MYSQL
//INSERT INTO productos (nombre, precio, cantidad, descripcion, marca) VALUES
//('Laptop Gamer', 1200.50, 10, 'Laptop potente', 'Asus'),
//        ('Smartphone', 650.00, 25, 'Teléfono Android', 'Samsung'),
//        ('Auriculares Bluetooth', 75.99, 50, 'Auriculares inalámbricos', 'Sony'),
//        ('Monitor 24"', 180.00, 15, 'Monitor Full HD', 'LG'),
//        ('Teclado Mecánico', 95.00, 30, 'Teclado RGB', 'HyperX'),
//        ('Mouse Gamer', 45.00, 40, 'Mouse óptico', 'Logitech'),
//        ('Impresora', 150.00, 12, 'Impresora a color', 'HP'),
//        ('Tablet', 320.00, 20, 'Tablet 10"', 'Lenovo'),
//        ('Disco SSD 1TB', 110.00, 18, 'Almacenamiento rápido', 'Kingston'),
//        ('Cámara Digital', 500.00, 8, 'Cámara compacta', 'Canon');
//


        public class HibernateCrudServiceProducto {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        ProductoService service = new ProductoServiceImpl(em);

        System.out.println("========== listar ==========");
        List<Producto> productos = service.listar();
        productos.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("========== obtener por id ==========");
        Optional<Producto> optionalProducto = service.porId(1L);
        optionalProducto.ifPresent(System.out::println);
        System.out.println("\n");

        System.out.println("========== insertar nuevo producto ===========");
        Producto producto = new Producto();
        producto.setNombre("Teclado");
        producto.setPrecio(2500.0);
        producto.setCantidad(10);
        producto.setDescripcion("Teclado mecanico");
        producto.setMarca("Logitech");
        service.guardar(producto);
        System.out.println("producto guardado con exito");
        service.listar().forEach(System.out::println);
        System.out.println("\n");

        System.out.println("=========== editar producto ==========");
        Long id = producto.getId();
        optionalProducto = service.porId(id);
        optionalProducto.ifPresent(p -> {
            p.setPrecio(3000.0);
            p.setCantidad(15);
            service.guardar(p);
            System.out.println("producto editado con exito!");
            service.listar().forEach(System.out::println);
        });
        System.out.println("\n");

        System.out.println("========== eliminar producto ===========");
        id = producto.getId();
        optionalProducto = service.porId(id);
        optionalProducto.ifPresent(p -> {
            service.eliminar(p.getId());
            System.out.println("producto eliminado con exito!");
            service.listar().forEach(System.out::println);
        });
        System.out.println("\n");

        em.close();
    }
}
