package Singleton;

import EntradaSalidaPF.SalidaConcreta;

public class CajaRegistradora {
    private static CajaRegistradora instancia;
    private int totalVentas;
    
    SalidaConcreta retornar = new SalidaConcreta();
    
    
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
        retornar.salida("Venta registrada: $" + monto);
    }
    
    public int getTotalVentas() {
        return totalVentas;
    }
}
