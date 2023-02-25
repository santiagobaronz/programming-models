/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocalculadora;

import fabrica.FabricaAbstracta;
import fabrica.FabricaBasica;

/**
 *
 * @author Laurita
 */
public class EjercicioCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaAbstracta fabrica = new FabricaBasica();
        
        double num_1 = fabrica.generarEntrada().entrada();
        double num_2 = fabrica.generarEntrada().entrada();

        String respuesta = fabrica.generarOperaciones().sumar(num_1, num_2);
        fabrica.generarSalida().salida(respuesta);
        
        String respuesta1 = fabrica.generarOperaciones().restar(num_1, num_2);
        fabrica.generarSalida().salida(respuesta1);
        
        String respuesta2 = fabrica.generarOperaciones().multiplicar(num_1, num_2);
        fabrica.generarSalida().salida(respuesta2);
        
        String respuesta3 = fabrica.generarOperaciones().dividir(num_1, num_2);
        fabrica.generarSalida().salida(respuesta3);
        
        
    }
    
}
