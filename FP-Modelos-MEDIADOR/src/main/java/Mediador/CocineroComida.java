package Mediador;

import EntradaSalidaPF.SalidaConcreta;

public class CocineroComida extends Cocinero {
    SalidaConcreta retornar = new SalidaConcreta();

    public CocineroComida(Mediador mediador) {
        super(mediador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(this, mensaje);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        retornar.salida("Cocinero de comida recibe el mensaje: " + mensaje);
    }
}