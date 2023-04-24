package Main;

import PatronEstrategia.CalculadoraEnvio;
import PatronEstrategia.EnvioEstandar;
import PatronEstrategia.EnvioInternacional;
import PatronEstrategia.EnvioStrategy;
import PatronEstrategia.EnvioUrgente;

public class Main {
    public static void main(String[] args) {
        CalculadoraEnvio calculador = new CalculadoraEnvio();

        // Usando la estrategia de envio estandar
        calculador.setEstrategia((EnvioStrategy) new EnvioEstandar());
        double costoEstandar = calculador.calcularCostoEnvio(10, 1000);

        // Usando la estrategia de envio urgente
        calculador.setEstrategia((EnvioStrategy) new EnvioUrgente());
        double costoUrgente = calculador.calcularCostoEnvio(10, 1000);

        // Usando la estrategia de envio internacional
        calculador.setEstrategia((EnvioStrategy) new EnvioInternacional());
        double costoInternacional = calculador.calcularCostoEnvio(10, 1000);
    }
}
