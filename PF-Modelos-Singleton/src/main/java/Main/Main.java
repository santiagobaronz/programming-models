package Main;

import Singleton.CajaRegistradora;

public class Main {
     public static void main(String[] args) {
        // Obtener la instancia de la caja registradora
        CajaRegistradora caja = CajaRegistradora.getInstance();
        
        caja.registrarVenta(20.50);
        caja.registrarVenta(15.75);
        caja.registrarVenta(10.25);
        
        int totalVentas = caja.getTotalVentas();
        System.out.println("Total de ventas: $" + totalVentas);
    }
}
