package Builders;
import Ingredientes.Masa;
import Ingredientes.MasaConcreta;
import Ingredientes.Relleno;
import Ingredientes.RellenoConcreto;
import Ingredientes.Salsa;
import Ingredientes.SalsaConcreta;
import Producto.Pizza;

public class PicantePizzaBuilder extends PizzaBuilder {

    public PicantePizzaBuilder() {
        super.pizza = new Pizza();
    }

    public void buildMasa() {
        Masa tipoMasa = new MasaConcreta();
        pizza.setMasa(tipoMasa.masaCocida());
    }

    public void buildSalsa() {
        Salsa tipoSalsa = new SalsaConcreta();
        pizza.setSalsa(tipoSalsa.salsaPicante());
    }

    public void buildRelleno() {
        Relleno tipoRelleno = new RellenoConcreto();
        pizza.setRelleno(tipoRelleno.rellenoPepinillos());
    }

}
