package Mediador;

public class CocineroComida extends Cocinero {
    public CocineroComida(Mediador mediador) {
        super(mediador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(this, mensaje);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Cocinero de comida recibe el mensaje: " + mensaje);
    }
}