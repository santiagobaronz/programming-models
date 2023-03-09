package Main_builder;

import Director.Cocina;
import Builders.HawaiPizzaBuilder;
import Builders.PicantePizzaBuilder;
import Builders.PizzaBuilder;
import Producto.Pizza;

public class Main_builder {

    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        
        PizzaBuilder objHawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder objPicantePizzaBuilder = new PicantePizzaBuilder();
        
        Pizza pizza = cocina.cocinarPizza(objPicantePizzaBuilder);
    }
    
}
