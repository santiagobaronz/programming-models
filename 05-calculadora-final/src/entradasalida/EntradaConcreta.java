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
public class EntradaConcreta extends EntradaAbstracta{

    @Override
    public int entrada() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num_1 = sc.nextInt();
        
        return num_1;
        
    }
    
    
}
