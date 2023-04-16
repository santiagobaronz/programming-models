/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carnet;

/**
 *
 * @author Sebas
 */
public class CarnetFactory {
    public Carnet obtenerCarnet(String codigo){
        return new CarnetFacultadIngenieria(codigo);
    }
}
