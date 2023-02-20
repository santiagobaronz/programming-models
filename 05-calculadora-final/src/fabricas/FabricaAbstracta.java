/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import entradasalida.EntradaAbstracta;
import entradasalida.SalidaAbstracta;
import operaciones.OperacionAbstracta;

/**
 *
 * @author Laurita
 */
public abstract class FabricaAbstracta {
    
    public abstract EntradaAbstracta generarEntrada();
    public abstract SalidaAbstracta generarSalida();
    
    public abstract OperacionAbstracta generarOperacion();
    
}
