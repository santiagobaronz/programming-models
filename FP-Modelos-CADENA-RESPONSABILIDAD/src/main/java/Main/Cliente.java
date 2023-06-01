package Main;

import ManejadoresConcretos.Dueño;
import ManejadoresConcretos.Gerente;
import ManejadoresConcretos.Mesero;
import Solicitud.ManejadorSolicitud;
import Solicitud.Solicitud;

public class Cliente {

    public void iniciarCliente() {
        ManejadorSolicitud mesero = new Mesero();
        ManejadorSolicitud gerente = new Gerente();
        ManejadorSolicitud Dueño = new Dueño();

        mesero.setSiguiente(gerente);
        gerente.setSiguiente(Dueño);

        Solicitud solicitud = new Solicitud("Queja");

        mesero.manejarSolicitud(solicitud);
    }
}
