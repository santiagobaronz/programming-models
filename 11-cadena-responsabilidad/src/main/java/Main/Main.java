package Main;

import responsabilidad.ManejadorCreditoConcreto;

public class Main {
    public static void main(String[] args) {
        ManejadorCreditoConcreto manejadorCreditoConcreto = new ManejadorCreditoConcreto();
        ManejadorCreditoConcreto lider = new ManejadorCreditoConcreto();
        ManejadorCreditoConcreto gerente = new ManejadorCreditoConcreto();
        ManejadorCreditoConcreto director = new ManejadorCreditoConcreto();

        manejadorCreditoConcreto.establecerSiguiente(lider);
        lider.establecerSiguiente(gerente);
        gerente.establecerSiguiente(director);

        int montoCredito = 200;
        manejadorCreditoConcreto.manejarCredito(montoCredito);
    }
}