package Menu;

import Cocina.Ingredientes;
import Cocina.Recetas;
import EntradaSalidaPF.SalidaConcreta;

public class MenuImplementacion1 implements Menu {
    private Ingredientes ingredientes;
    private Recetas recetas;
    
    SalidaConcreta retornar = new SalidaConcreta();


    public MenuImplementacion1(Ingredientes ingredientes, Recetas recetas) {
        this.ingredientes = ingredientes;
        this.recetas = recetas;
    }

    @Override
    public void mostrarPlatos() {
        retornar.salida("Platos disponibles Menu 1:");
        retornar.salida("Plato 1: " + recetas.getNombre());
    }

}
