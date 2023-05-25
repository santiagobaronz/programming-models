package Concretas;

import Abstractas.ConstructorComida;
import Cocina.ComidaCombinada;

public class DirectorComida {
    private ConstructorComida constructor;

    public void setConstructor(ConstructorComida constructor) {
        this.constructor = constructor;
    }

    public ComidaCombinada construirComida() {
        constructor.construirHamburguesa("Pollo");
        constructor.construirPapasFritas("Medianas");
        constructor.construirBebida("Coca Cola");
        return constructor.obtenerComida();
    }
}
