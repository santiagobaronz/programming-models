
package Mediador;

import java.util.ArrayList;
import java.util.List;

public class MediadorCocina implements Mediador {
    private List<Cocinero> cocineros;

    public MediadorCocina() {
        cocineros = new ArrayList<>();
    }

    public void registrarCocinero(Cocinero cocinero) {
        cocineros.add(cocinero);
    }

    @Override
    public void enviarMensaje(Cocinero remitente, String mensaje) {
        for (Cocinero cocinero : cocineros) {
            if (cocinero != remitente) {
                cocinero.recibirMensaje(mensaje);
            }
        }
    }
}
