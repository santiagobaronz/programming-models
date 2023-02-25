package Fabricas;

import Entradas.EntradaAbstracta;
import Operacion.OperacionAbstracta;
import Salidas.SalidaAbstracta;

public abstract class FabricaESAbstracta {

    public abstract EntradaAbstracta entrada();

    public abstract SalidaAbstracta salida();

    public abstract OperacionAbstracta operacion();
}
