/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

/**
 *
 * @author Laurita
 */
public class SalidaConcreta extends SalidaAbstracta{

    @Override
    public void salida(String resultado) {
        
        System.out.println("El resultado de la operación es... : "+resultado);
        
    }
    
    
    
}
