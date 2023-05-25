package Solicitud;

public interface ManejadorSolicitud {
    void setSiguiente(ManejadorSolicitud siguiente);
    void manejarSolicitud(Solicitud solicitud);
}
