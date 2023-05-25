package Mediador;

public abstract class Cocinero {
    protected Mediador mediador;

    public Cocinero(Mediador mediador) {
        this.mediador = mediador;
    }

    public abstract void enviarMensaje(String mensaje);
    public abstract void recibirMensaje(String mensaje);
}
