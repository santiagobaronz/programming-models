package ManejadoresConcretos;

import EntradaSalidaPF.SalidaConcreta;
import Solicitud.ManejadorSolicitud;
import Solicitud.Solicitud;

public class Gerente implements ManejadorSolicitud {
    private ManejadorSolicitud siguiente;
    SalidaConcreta retornar = new SalidaConcreta();

    public void setSiguiente(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getTipo().equals("Queja")) {
            retornar.salida("El gerente del restaurante está manejando la queja del cliente.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }
}
