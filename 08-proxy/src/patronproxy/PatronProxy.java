/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronproxy;

import Proxy.CalculadoraProxyIMC;

/**
 *
 * @author Sebas
 */
public class PatronProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingresa tu peso y edad en Kg y m correspondientemente");
        
        CalculadoraProxyIMC proxy = new CalculadoraProxyIMC();
        
        double resultado;
        
        resultado = proxy.calcularIMC(60, 180);
        
        System.out.println("El IMC es: " + resultado);
        
        if(resultado < 18.5){
            System.out.println("Su peso es bajo");

        } else if (resultado > 18.5 & resultado < 24.9 ){
            System.out.println("Su peso es normal");

        } else if (resultado > 25){
            System.out.println("Su peso es superior al normal");

        } 
        
        
    }
    
}
