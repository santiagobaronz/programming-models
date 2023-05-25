package Abstractas;

import Cocina.ComidaCombinada;

public interface ConstructorComida {
    public void construirHamburguesa(String tipo);
    public void construirPapasFritas(String tipo);
    public void construirBebida(String tipo);
    ComidaCombinada obtenerComida();
}
