package Main;

import Abstractas.Carne;
import Abstractas.Pan;
import EntradaSalidaPF.SalidaConcreta;
import Fabrica.FabricaIngredientes;
import Fabrica.FabricaIngredientesDoble;
import Fabrica.FabricaIngredientesSencilla;

public class Cliente {

    public void ClienteCocina() {
        {
            FabricaIngredientes fabricaSencilla = new FabricaIngredientesSencilla();

            Pan panSencillo = fabricaSencilla.crearPan();
            Carne carneRes = fabricaSencilla.crearCarne();
            
            SalidaConcreta retornar = new SalidaConcreta();

            retornar.salida("Hamburguesa sencilla:");
            retornar.salida("Pan: " + panSencillo.getTipoPan());
            retornar.salida("Carne: " + carneRes.getTipoCarne());

            FabricaIngredientes fabricaDoble = new FabricaIngredientesDoble();
            
            Pan panDoble = fabricaDoble.crearPan();
            Carne carnePollo = fabricaDoble.crearCarne();

            retornar.salida("\nHamburguesa doble:");
            retornar.salida("Pan: " + panDoble.getTipoPan());
            retornar.salida("Carne: " + carnePollo.getTipoCarne());
        }
    }
}
