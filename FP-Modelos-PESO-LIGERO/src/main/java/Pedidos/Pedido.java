package Pedidos;

public class Pedido {
    private String nombre;
    private double precio;

    public Pedido(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
