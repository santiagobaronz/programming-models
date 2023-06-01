package Main;

import Mediador.CocineroComida;
import Mediador.CocineroEntrada;
import Mediador.MediadorCocina;

public class Cliente {

    public void iniciarCliente() {
        MediadorCocina mediador = new MediadorCocina();

        CocineroEntrada cocineroEntrante = new CocineroEntrada(mediador);
        CocineroComida cocineroComida = new CocineroComida(mediador);

        mediador.registrarCocinero(cocineroEntrante);
        mediador.registrarCocinero(cocineroComida);

        cocineroEntrante.enviarMensaje("Preparar papas fritas");
        cocineroComida.enviarMensaje("Preparando Patacones...");
    }
}
