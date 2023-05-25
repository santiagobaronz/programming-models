
package Fabrica;

import Abstractas.Carne;
import Abstractas.Pan;
import Concretas.CarneRes;
import Concretas.PanSencillo;


public class FabricaIngredientesSencilla implements FabricaIngredientes {
    @Override
    public Pan crearPan() {
        return new PanSencillo();
    }

    @Override
    public Carne crearCarne() {
        return new CarneRes();
    }
}
