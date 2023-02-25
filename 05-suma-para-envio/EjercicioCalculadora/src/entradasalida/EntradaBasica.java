/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

import java.util.Scanner;

/**
 *
 * @author Laurita
 */
public class EntradaBasica extends EntradaAbstracta{

    @Override
    public double entrada() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        double numero = sc.nextInt();
        
        return numero;
        
    }
    
}
