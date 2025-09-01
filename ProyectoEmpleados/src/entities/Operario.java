package entities;

import entities.abstractas.Empleado;

public class Operario extends Empleado {
    //Constructor
    public Operario(String nombre) {
        super(nombre);
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void registrarEmpleado() {
        System.out.println("Operario registrado");
    }
}
