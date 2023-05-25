package Singleton;

public class CajaRegistradora {
    private static CajaRegistradora instancia;
    private int totalVentas;
    
    public CajaRegistradora() {
        // Inicialización de la caja registradora
        totalVentas = 0;
    }
    
    public static CajaRegistradora getInstance() {
        if (instancia == null) {
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    
    public void registrarVenta(double monto) {
        totalVentas += monto;
        System.out.println("Venta registrada: $" + monto);
    }
    
    public int getTotalVentas() {
        return totalVentas;
    }
}
