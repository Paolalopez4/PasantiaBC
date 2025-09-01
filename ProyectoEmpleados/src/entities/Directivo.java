package entities;

import entities.abstractas.Empleado;

public class Directivo extends Empleado {
    //Constructor
    public Directivo(String nombre) {
        super(nombre);
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void registrarEmpleado() {
        System.out.println("Directivo registrado");
    }
}
