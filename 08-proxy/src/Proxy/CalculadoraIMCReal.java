/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author Sebas
 */
public class CalculadoraIMCReal extends CalculadoraIMC {
    
    double alturaMetros;

    @Override
    public double calcularIMC(double peso, double altura) {
        alturaMetros = altura/100;
        return peso/(alturaMetros * alturaMetros);
    }
    
    
    
}
