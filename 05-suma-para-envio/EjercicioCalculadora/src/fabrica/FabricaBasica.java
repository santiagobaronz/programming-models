/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import entradasalida.EntradaAbstracta;
import entradasalida.EntradaBasica;
import entradasalida.SalidaAbstracta;
import entradasalida.SalidaBasica;
import operaciones.OperacionAbstracta;
import operaciones.OperacionBasica;

/**
 *
 * @author Laurita
 */
public class FabricaBasica extends FabricaAbstracta{

    @Override
    public EntradaAbstracta generarEntrada() {
        
        EntradaAbstracta entrada = new EntradaBasica();
        return entrada;
        
    }
    
    @Override
    public SalidaAbstracta generarSalida() {
        
        SalidaAbstracta salida = new SalidaBasica();
        return salida;
    }
}
