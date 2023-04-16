/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carnet;

/**
 *
 * @author Sebas
 */
public class CarnetFacultadIngenieria implements Carnet {

    private String codigo;

    public CarnetFacultadIngenieria(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public void imprimirCarnet(String nombre, String ingenieria) {
        System.out.println("-------------------------------------------");
        System.out.println("nombre: " + nombre);
        System.out.println("codigo: " + codigo);
        System.out.println("ingenieria: " + ingenieria);
        System.out.println("Facultad: Ingenieria");
        System.out.println("-------------------------------------------");
    }
    
}
