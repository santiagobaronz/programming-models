package ManejadoresConcretos;

import Solicitud.ManejadorSolicitud;
import Solicitud.Solicitud;

public class Mesero implements ManejadorSolicitud {
    private ManejadorSolicitud siguiente;

    public void setSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getTipo().equals("Recomendación")) {
            System.out.println("El mesero está manejando la recomendación del cliente.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }
}
