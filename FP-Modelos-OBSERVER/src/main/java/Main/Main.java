package Main;

import Cocina.Cocinero;
import Observador.Inventario;


public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Cocinero cocinero1 = new Cocinero("Santiago");
        Cocinero cocinero2 = new Cocinero("Steven");

        inventario.agregarObservador(cocinero1);
        inventario.agregarObservador(cocinero2);

        inventario.setIngredienteAgotado(true);
    }
}
