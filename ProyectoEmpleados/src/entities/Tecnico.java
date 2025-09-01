package entities;

public class Tecnico extends Operario{
    //Constructor
    public Tecnico(String nombre) {
        super(nombre);
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void registrarEmpleado() {
        System.out.println("Tecnico registrado");
    }
}
