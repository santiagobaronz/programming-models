package ManejadoresConcretos;

import Solicitud.ManejadorSolicitud;
import Solicitud.Solicitud;

public class Gerente implements ManejadorSolicitud {
    private ManejadorSolicitud siguiente;

    public void setSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getTipo().equals("Queja")) {
            System.out.println("El gerente del restaurante está manejando la queja del cliente.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }
}
