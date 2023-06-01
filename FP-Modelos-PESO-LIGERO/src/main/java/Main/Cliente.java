package Main;

import EntradaSalidaPF.SalidaConcreta;
import Pedidos.FabricaPedidos;
import Pedidos.Pedido;

public class Cliente {

    public void iniciarCliente() {
        FabricaPedidos fabrica = new FabricaPedidos();
        SalidaConcreta retornar = new SalidaConcreta();



        Pedido pedido1 = fabrica.getPedido("Pizza");
        Pedido pedido2 = fabrica.getPedido("Hamburguesa");
        Pedido pedido3 = fabrica.getPedido("Ensalada");

        retornar.salida("Pedido 1: " + pedido1.getNombre() + ", Precio: $" + pedido1.getPrecio());
        retornar.salida("Pedido 2: " + pedido2.getNombre() + ", Precio: $" + pedido2.getPrecio());
        retornar.salida("Pedido 3: " + pedido3.getNombre() + ", Precio: $" + pedido3.getPrecio());
    }
}
