/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import entradasalida.EntradaAbstracta;
import entradasalida.EntradaConcreta;
import entradasalida.SalidaAbstracta;
import entradasalida.SalidaConcreta;
import operaciones.OperacionAbstracta;
import operaciones.OperacionConcreta;

/**
 *
 * @author Laurita
 */
public class FabricaConcreta extends FabricaAbstracta{

    @Override
    public EntradaAbstracta generarEntrada() {
        
        EntradaAbstracta entrada = new EntradaConcreta();
        return entrada;
        
    }
    
    @Override
    public SalidaAbstracta generarSalida() {
        
        SalidaAbstracta salida = new SalidaConcreta();
        return salida;
    }

    @Override
    public OperacionAbstracta generarOperacion() {
        
        OperacionAbstracta operacion = new OperacionConcreta();
        return operacion;
        
    }
    
    
    
}
