/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.mod_pro.marcadores.abs.factory;

class MarcadorConColor implements Marcador {
   private String color;
   
   public MarcadorConColor(String color) {
      this.color = color;
   }
   
   @Override
   public void crear() {
      System.out.println("Crear marcador de color " + color);
   }
}
