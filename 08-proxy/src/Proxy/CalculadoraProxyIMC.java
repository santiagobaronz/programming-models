/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author Sebas
 */
public class CalculadoraProxyIMC extends CalculadoraIMC {
    private CalculadoraIMC objCalculadoraIMC;

    @Override
    public double calcularIMC(double peso, double altura) {
        objCalculadoraIMC = new CalculadoraIMCReal();
        return objCalculadoraIMC.calcularIMC(peso, altura);
    } 
    
}
