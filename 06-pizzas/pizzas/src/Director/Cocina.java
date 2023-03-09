package Director;

import Builders.PizzaBuilder;
import Producto.Pizza;

public class Cocina {

    private PizzaBuilder pizzaBuilder;

    public Pizza cocinarPizza(PizzaBuilder pb){
        pizzaBuilder = pb;
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
        return pizzaBuilder.getPizza();
    }
}
