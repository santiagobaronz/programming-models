package PatronEstrategia;

public class EnvioEstandar {
    public double calcularCostoEnvio(double peso, double distancia) {
        double costoBase = 5.0;
        double costoPeso = peso * 0.1;
        double costoDistancia = distancia * 0.01;
        return costoBase + costoPeso + costoDistancia;
    }
}
