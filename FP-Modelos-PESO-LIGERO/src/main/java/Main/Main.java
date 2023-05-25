package Main;

import Pedidos.FabricaPedidos;
import Pedidos.Pedido;

public class Main {
     public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();

        Pedido pedido1 = fabrica.getPedido("Pizza");
        Pedido pedido2 = fabrica.getPedido("Hamburguesa");
        Pedido pedido3 = fabrica.getPedido("Ensalada");

        System.out.println("Pedido 1: " + pedido1.getNombre() + ", Precio: $" + pedido1.getPrecio());
        System.out.println("Pedido 2: " + pedido2.getNombre() + ", Precio: $" + pedido2.getPrecio());
        System.out.println("Pedido 3: " + pedido3.getNombre() + ", Precio: $" + pedido3.getPrecio());
    }
}
