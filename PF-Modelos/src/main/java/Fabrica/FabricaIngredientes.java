package Fabrica;

import Abstractas.Carne;
import Abstractas.Pan;

public interface FabricaIngredientes {
    Pan crearPan();
    Carne crearCarne();
}
