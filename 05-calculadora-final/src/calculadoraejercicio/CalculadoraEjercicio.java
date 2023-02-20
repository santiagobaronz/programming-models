/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraejercicio;

import fabricas.FabricaAbstracta;
import fabricas.FabricaConcreta;

/**
 *
 * @author Laurita
 */
public class CalculadoraEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricaAbstracta fabrica = new FabricaConcreta();

        int num1 = fabrica.generarEntrada().entrada();
        int num2 = fabrica.generarEntrada().entrada();

        int resultado = fabrica.generarOperacion().sumar(num1, num2);
        fabrica.generarSalida().salida(Integer.toString(resultado));

    }

}
