package PatronEstrategia;

public class CalculadoraEnvio {
    private EnvioStrategy estrategia;

    public void setEstrategia(EnvioStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularCostoEnvio(double peso, double distancia) {
        return estrategia.calcularCostoEnvio(peso, distancia);
    }
}
