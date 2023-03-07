package Director;

import Builders.PizzaBuilder;
import Producto.Pizza;

public class Cocina {

    private PizzaBuilder pizzaBuilder;

//    public void setPizzaBuilder(PizzaBuilder pb) {
//        pizzaBuilder = pb;
//    }
//
//    public Pizza getPizza() {
//        return pizzaBuilder.getPizza();
//    }
//
//    public void construirPizza() {
//        pizzaBuilder.buildMasa();
//        pizzaBuilder.buildSalsa();
//        pizzaBuilder.buildRelleno();
//    }
   
    // Se hace el arreglo solicitado en clase para evitar el error de
    // construccion que se puede presentar:
    
    public Pizza cocinarPizza(PizzaBuilder pb){
        pizzaBuilder = pb;
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
        return pizzaBuilder.getPizza();
    }
}
