package Salidas;

import javax.swing.JOptionPane;

public class SalidaInterfaz extends SalidaAbstracta {

    @Override
    public void out(String resultado) {
        JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
    }
}
