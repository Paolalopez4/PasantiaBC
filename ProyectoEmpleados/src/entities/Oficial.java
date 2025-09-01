package entities;

public class Oficial extends Operario{
    //Constructpr
    public Oficial(String nombre) {
        super(nombre);
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void registrarEmpleado() {
        System.out.println("Oficial registrado");
    }
}
