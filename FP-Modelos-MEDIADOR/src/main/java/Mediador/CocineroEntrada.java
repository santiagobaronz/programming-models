package Mediador;

import EntradaSalidaPF.SalidaConcreta;

public class CocineroEntrada extends Cocinero {
    SalidaConcreta retornar = new SalidaConcreta();

    public CocineroEntrada(Mediador mediador) {
        super(mediador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(this, mensaje);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        retornar.salida("Cocinero de entrada recibe el mensaje: " + mensaje);
    }
}