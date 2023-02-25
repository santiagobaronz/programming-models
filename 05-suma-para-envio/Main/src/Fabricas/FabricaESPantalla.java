package Fabricas;

import Entradas.EntradaAbstracta;
import Entradas.EntradaPantalla;
import Operacion.OperacionAbstracta;
import Operacion.OperacionSuma;
import Salidas.SalidaAbstracta;
import Salidas.SalidaPantalla;

public class FabricaESPantalla extends FabricaESAbstracta {

    @Override
    public EntradaAbstracta entrada() {
        EntradaAbstracta entrada = new EntradaPantalla();
        return entrada;
    }

    @Override
    public SalidaAbstracta salida() {
        SalidaAbstracta salida = new SalidaPantalla();
        return salida;
    }

    @Override
    public OperacionAbstracta operacion() {
        OperacionAbstracta operacion = new OperacionSuma();
        return operacion;
    }

}
