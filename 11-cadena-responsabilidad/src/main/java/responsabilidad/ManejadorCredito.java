package responsabilidad;

public interface ManejadorCredito {
    void establecerSiguiente(ManejadorCredito siguiente);
    void manejarCredito(int monto);
}