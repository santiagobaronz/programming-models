package Cocina;

import Observador.Observador;

public class Empleado implements Observador {
    private final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String orden) {
        System.out.println("Atención, " + nombre + "! Nueva orden pendiente de: " + orden);
    }
}