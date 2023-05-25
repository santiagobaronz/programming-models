package Menu;

import Cocina.Ingredientes;
import Cocina.Recetas;

public class MenuImplementacion2 implements Menu {
    private Ingredientes ingredientes;
    private Recetas recetas;

    public MenuImplementacion2(Ingredientes ingredientes, Recetas recetas) {
        this.ingredientes = ingredientes;
        this.recetas = recetas;
    }

    @Override
    public void mostrarPlatos() {
        System.out.println("Platos disponibles Menu 2:");
        System.out.println("Plato 1: " + recetas.getNombre());
    }

}
