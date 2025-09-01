package entities.abstractas;

public abstract class Empleado {
    //Atributos
    private String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public abstract void registrarEmpleado();
}
