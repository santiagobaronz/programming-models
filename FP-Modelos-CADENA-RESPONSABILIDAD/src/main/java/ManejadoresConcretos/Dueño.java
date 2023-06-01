package ManejadoresConcretos;

import EntradaSalidaPF.SalidaConcreta;
import Solicitud.ManejadorSolicitud;
import Solicitud.Solicitud;

public class Dueño implements ManejadorSolicitud {
    private ManejadorSolicitud siguiente;
    SalidaConcreta retornar = new SalidaConcreta();

    public void setSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getTipo().equals("Solicitud")) {
            retornar.salida("El dueño está manejando la solicitud del cliente.");
            // Lógica para manejar la queja
        } else {
            retornar.salida("La solicitud no puede ser manejada.");
        }
    }
}
