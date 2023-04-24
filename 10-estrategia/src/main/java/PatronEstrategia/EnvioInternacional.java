package PatronEstrategia;

public class EnvioInternacional {
    public double calcularCostoEnvio(double peso, double distancia) {
        double costoBase = 20.0;
        double costoPeso = peso * 0.5;
        double costoDistancia = distancia * 0.05;
        double costoAduana = peso * distancia * 0.001;
        return costoBase + costoPeso + costoDistancia + costoAduana;
    }
}
