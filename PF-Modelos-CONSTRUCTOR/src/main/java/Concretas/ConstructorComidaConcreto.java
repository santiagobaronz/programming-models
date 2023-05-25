package Concretas;

import Abstractas.ConstructorComida;
import Cocina.ComidaCombinada;
public class ConstructorComidaConcreto implements ConstructorComida {
    private ComidaCombinada comidaCombinada;

    public ConstructorComidaConcreto() {
        this.comidaCombinada = new ComidaCombinada();
    }

    @Override
    public void construirHamburguesa(String tipo) {
        comidaCombinada.setHamburguesa("Hamburguesa: " + tipo);
    }

    @Override
    public void construirPapasFritas(String tipo) {
        comidaCombinada.setPapasFritas("Papas fritas: " + tipo);
    }

    @Override
    public void construirBebida(String tipo) {
        comidaCombinada.setBebida("Bebida: " + tipo);
    }

    @Override
    public ComidaCombinada obtenerComida() {
        return comidaCombinada;
    }
}
