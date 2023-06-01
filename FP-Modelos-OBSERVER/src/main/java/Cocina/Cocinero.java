
package Cocina;

import EntradaSalidaPF.SalidaConcreta;
import Observador.Observador;

public class Cocinero implements Observador {
    SalidaConcreta retornar = new SalidaConcreta();

    private String nombre;

    public Cocinero(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar() {
        retornar.salida(nombre + " fue actualizado de que no hay stock del producto");
    }
}
