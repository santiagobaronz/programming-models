/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udistrital.mod_pro.marcadores.abs.factory;

/**
 *
 * @author Santiago Baron Zuleta
 */

public class MarcadoresAbsFactory {
   public static void main(String[] args) {
      FabricaMarcadorAbstracta fabrica = new FabricaMarcador();
      Marcador tapaMarcador = fabrica.getMarcador("TAPA", null);
      tapaMarcador.crear();
      
      Marcador cuerpoMarcador = fabrica.getMarcador("CUERPO", null);
      cuerpoMarcador.crear();
      
      Marcador marcador = fabrica.getMarcador("MARCADOR", "rojo");
      marcador.crear();
   }
}