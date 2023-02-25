package Salidas;

public class SalidaPantalla extends SalidaAbstracta {

    @Override
    public void out(String resultado) {
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
