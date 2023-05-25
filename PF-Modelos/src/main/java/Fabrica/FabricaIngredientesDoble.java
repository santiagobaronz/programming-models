package Fabrica;

import Abstractas.Carne;
import Abstractas.Pan;
import Concretas.CarnePollo;
import Concretas.PanDoble;

public class FabricaIngredientesDoble implements FabricaIngredientes {
    @Override
    public Pan crearPan() {
        return new PanDoble();
    }

    @Override
    public Carne crearCarne() {
        return new CarnePollo();
    }
}
