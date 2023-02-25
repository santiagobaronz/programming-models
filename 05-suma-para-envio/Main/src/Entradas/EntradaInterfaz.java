package Entradas;

import javax.swing.JOptionPane;

public class EntradaInterfaz extends EntradaAbstracta {

    @Override
    public String entrada() {
        return JOptionPane.showInputDialog("Ingrese un numero: ");
    }
}
