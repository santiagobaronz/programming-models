package Main;

import Mediador.CocineroEntrada;
import Mediador.CocineroComida;
import Mediador.MediadorCocina;

public class Main {
    public static void main(String[] args) {
        MediadorCocina mediador = new MediadorCocina();

        CocineroEntrada cocineroEntrante = new CocineroEntrada(mediador);
        CocineroComida cocineroComida = new CocineroComida(mediador);

        mediador.registrarCocinero(cocineroEntrante);
        mediador.registrarCocinero(cocineroComida);

        cocineroEntrante.enviarMensaje("Preparar papas fritas");
        cocineroComida.enviarMensaje("Preparando Patacones...");
    }
}
