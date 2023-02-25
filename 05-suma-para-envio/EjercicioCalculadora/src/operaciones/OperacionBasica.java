/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.text.DecimalFormat;

/**
 *
 * @author Laurita
 */
public class OperacionBasica extends OperacionAbstracta{
    
    @Override
    public String sumar(double num1, double num2){
        
        double resultado = num1 + num2;
        
        return "sumar los numeros es: " + String.valueOf(resultado);
    }
    
    @Override
    public String restar(double num1, double num2){
        
        double resultado = num1 - num2;
        
        return "restar los numeros es: " + String.valueOf(resultado);
    }
    
    @Override
    public String multiplicar(double num1, double num2){
        
        double resultado = num1 * num2;
        
        return "multiplicar los numeros es: " + String.valueOf(resultado);
    }
    
    @Override
    public String dividir(double num1, double num2){
        
        double resultado = num1 / num2;
        
        return "dividir los numeros es: " + String.valueOf(Math.round(resultado * 100d) / 100d);
    }
    
}
