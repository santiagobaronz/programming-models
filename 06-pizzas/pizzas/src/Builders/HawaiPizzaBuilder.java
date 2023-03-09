package Builders;
import Ingredientes.Masa;
import Ingredientes.MasaConcreta;
import Ingredientes.Relleno;
import Ingredientes.RellenoConcreto;
import Ingredientes.Salsa;
import Ingredientes.SalsaConcreta;
import Producto.Pizza;

public class HawaiPizzaBuilder extends PizzaBuilder {

    public HawaiPizzaBuilder() {
        super.pizza = new Pizza();
    }

    public void buildMasa() {
        Masa tipoMasa = new MasaConcreta();
        pizza.setMasa(tipoMasa.masaSuave());
    }

    public void buildSalsa() {
        Salsa tipoSalsa = new SalsaConcreta();
        pizza.setSalsa(tipoSalsa.salsaDulce());
    }

    public void buildRelleno() {
        Relleno tipoRelleno = new RellenoConcreto();
        pizza.setRelleno(tipoRelleno.rellenoChorizo());
    }

}
