package Mediador;

public class CocineroEntrada extends Cocinero {
    public CocineroEntrada(Mediador mediador) {
        super(mediador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(this, mensaje);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Cocinero de entrada recibe el mensaje: " + mensaje);
    }
}