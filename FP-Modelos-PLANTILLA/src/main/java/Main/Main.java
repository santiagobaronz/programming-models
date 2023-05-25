package Main;

import Plato.PataconesPlato;
import Plato.SalchipapasPlato;
import Plato.Plato;

public class Main {
    public static void main(String[] args) {
        // Preparar un plato de pasta
        Plato salchipapas = new SalchipapasPlato();
        salchipapas.preparar();

        System.out.println("------------------------");

        Plato patacones = new PataconesPlato();
        patacones.preparar();
    }
}
