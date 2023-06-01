package Main;

import EntradaSalidaPF.SalidaConcreta;
import Singleton.CajaRegistradora;

public class Cliente {

    public void iniciarCliente() {
        CajaRegistradora caja = CajaRegistradora.getInstance();
        SalidaConcreta retornar = new SalidaConcreta();

        caja.registrarVenta(20.50);
        caja.registrarVenta(15.75);
        caja.registrarVenta(10.25);

        int totalVentas = caja.getTotalVentas();
        retornar.salida("Total de ventas: $" + totalVentas);
    }
}
