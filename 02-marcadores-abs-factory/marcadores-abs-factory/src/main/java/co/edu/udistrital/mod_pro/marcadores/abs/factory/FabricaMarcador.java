/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.mod_pro.marcadores.abs.factory;

class FabricaMarcador implements FabricaMarcadorAbstracta {
   @Override
   public Marcador getMarcador(String tipoMarcador, String color) {
      if (tipoMarcador.equalsIgnoreCase("TAPA")) {
         return new TapaMarcador();
      } else if (tipoMarcador.equalsIgnoreCase("CUERPO")) {
         return new CuerpoMarcador();
      } else if (tipoMarcador.equalsIgnoreCase("MARCADOR")) {
         return new MarcadorConColor(color);
      }
      return null;
   }
}