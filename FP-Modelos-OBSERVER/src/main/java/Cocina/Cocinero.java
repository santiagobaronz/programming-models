
package Cocina;

import Observador.Observador;

public class Cocinero implements Observador {
    private String nombre;

    public Cocinero(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar() {
        System.out.println(nombre + " fue actualizado de que no hay stock del producto");
    }
}
