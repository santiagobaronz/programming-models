package ManejadoresConcretos;

import Solicitud.ManejadorSolicitud;
import Solicitud.Solicitud;

public class Dueño implements ManejadorSolicitud {
    private ManejadorSolicitud siguiente;

    public void setSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getTipo().equals("Solicitud")) {
            System.out.println("El dueño está manejando la solicitud del cliente.");
            // Lógica para manejar la queja
        } else {
            System.out.println("La solicitud no puede ser manejada.");
        }
    }
}
