/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronflyweight;

import Carnet.Carnet;
import Carnet.CarnetFactory;

/**
 *
 * @author Sebas
 */
public class PatronFlyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarnetFactory factory = new CarnetFactory();
        
        Carnet carnet1 = factory.obtenerCarnet("2021202001s5");
        carnet1.imprimirCarnet("Sebastián Yepes Marta", "Sistemas");
        
        Carnet carnet2 = factory.obtenerCarnet("20212020052");
        carnet2.imprimirCarnet("Santiago Baron Zuleta", "Sistemas");
                
    }
    
}
