package Pedidos;

import java.util.HashMap;
import java.util.Map;

public class FabricaPedidos {
    private Map<String, Pedido> pedidos;

    public FabricaPedidos() {
        pedidos = new HashMap<>();
    }

    public Pedido getPedido(String nombre) {
        Pedido pedido = pedidos.get(nombre);

        if (pedido == null) {
            switch (nombre) {
                case "Pizza":
                    pedido = new Pedido("Pizza", 8.99);
                    break;
                case "Hamburguesa":
                    pedido = new Pedido("Hamburguesa", 6.99);
                    break;
                case "Ensalada":
                    pedido = new Pedido("Ensalada", 5.99);
                    break;
            }

            pedidos.put(nombre, pedido);
        }

        return pedido;
    }
}
