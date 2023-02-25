package Fabricas;

import Entradas.EntradaAbstracta;
import Entradas.EntradaArchivo;
import Operacion.OperacionAbstracta;
import Operacion.OperacionSuma;
import Salidas.SalidaAbstracta;
import Salidas.SalidaArchivo;

public class FabricaESArchivo extends FabricaESAbstracta {

    @Override
    public EntradaAbstracta entrada() {
        EntradaAbstracta entrada = new EntradaArchivo();
        return entrada;
    }

    @Override
    public SalidaAbstracta salida() {
        SalidaAbstracta salida = new SalidaArchivo();
        return salida;
    }

    @Override
    public OperacionAbstracta operacion() {
        OperacionAbstracta operacion = new OperacionSuma();
        return operacion;
    }

}
