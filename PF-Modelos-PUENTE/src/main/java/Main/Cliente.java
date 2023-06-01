package Main;

import Cocina.Ingredientes;
import Cocina.Recetas;
import Menu.Menu;
import Menu.MenuImplementacion1;
import Menu.MenuImplementacion2;

public class Cliente {

    public void iniciarCliente() {
        Ingredientes ingredientes1 = new Ingredientes("Ingrediente1", 10.0);
        Recetas recetas1 = new Recetas("Perro caliente", "Descripción de la receta 1");
        Menu menu1 = new MenuImplementacion1(ingredientes1, recetas1);
        menu1.mostrarPlatos();

        Ingredientes ingredientes2 = new Ingredientes("Ingrediente2", 20.0);
        Recetas recetas2 = new Recetas("Empanadas caseras", "Descripción de la receta 2");
        Menu menu2 = new MenuImplementacion2(ingredientes2, recetas2);
        menu2.mostrarPlatos();
    }

}
