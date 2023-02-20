/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Laurita
 */
public class OperacionConcreta extends OperacionAbstracta{
    
    @Override
    public int sumar(int num1, int num2){
        
        int resultado = num1 + num2;
        
        return resultado;
    }
    
}
