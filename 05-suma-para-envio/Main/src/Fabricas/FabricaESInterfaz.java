package Fabricas;

import Entradas.EntradaAbstracta;
import Entradas.EntradaInterfaz;
import Operacion.OperacionAbstracta;
import Operacion.OperacionSuma;
import Salidas.SalidaAbstracta;
import Salidas.SalidaInterfaz;

public class FabricaESInterfaz extends FabricaESAbstracta {

    @Override
    public EntradaAbstracta entrada() {
        EntradaAbstracta entrada = new EntradaInterfaz();
        return entrada;
    }

    @Override
    public SalidaAbstracta salida() {
        SalidaAbstracta salida = new SalidaInterfaz();
        return salida;
    }

    @Override
    public OperacionAbstracta operacion() {
        OperacionAbstracta operacion = new OperacionSuma();
        return operacion;
    }

}
