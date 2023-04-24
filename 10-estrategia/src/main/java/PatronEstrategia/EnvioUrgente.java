package PatronEstrategia;

public class EnvioUrgente {
    public double calcularCostoEnvio(double peso, double distancia) {
        double costoBase = 10.0;
        double costoPeso = peso * 0.2;
        double costoDistancia = distancia * 0.02;
        return costoBase + costoPeso + costoDistancia;
    }
}
