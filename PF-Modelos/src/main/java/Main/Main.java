package Main;

import Abstractas.Carne;
import Abstractas.Pan;
import Fabrica.FabricaIngredientes;
import Fabrica.FabricaIngredientesDoble;
import Fabrica.FabricaIngredientesSencilla;

public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de ingredientes para hamburguesas sencillas
        FabricaIngredientes fabricaSencilla = new FabricaIngredientesSencilla();
        
        // Crear ingredientes utilizando la fábrica de hamburguesas sencillas
        Pan panSencillo = fabricaSencilla.crearPan();
        Carne carneRes = fabricaSencilla.crearCarne();
        
        System.out.println("Hamburguesa sencilla:");
        System.out.println("Pan: " + panSencillo.getTipoPan());
        System.out.println("Carne: " + carneRes.getTipoCarne());
        
        // Crear una fábrica de ingredientes para hamburguesas dobles
        FabricaIngredientes fabricaDoble = new FabricaIngredientesDoble();
        
        // Crear ingredientes utilizando la fábrica de hamburguesas dobles
        Pan panDoble = fabricaDoble.crearPan();
        Carne carnePollo = fabricaDoble.crearCarne();
        
        System.out.println("\nHamburguesa doble:");
        System.out.println("Pan: " + panDoble.getTipoPan());
        System.out.println("Carne: " + carnePollo.getTipoCarne());
    }

}
