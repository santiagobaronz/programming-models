package Restaurante;

import Cocina.Cocina;
import Cocina.Empleado;

public class Restaurante {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        Empleado empleado1 = new Empleado("Santiago");
        Empleado empleado2 = new Empleado("Steven");

        cocina.agregarObservador(empleado1);
        cocina.agregarObservador(empleado2);

        cocina.agregarOrden("Perro caliente");

        cocina.eliminarObservador(empleado2);
        cocina.agregarOrden("Salchipapas");
    }
}
