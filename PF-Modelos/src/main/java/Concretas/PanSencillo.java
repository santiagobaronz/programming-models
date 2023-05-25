package Concretas;

import Abstractas.Pan;

public class PanSencillo implements Pan {
    @Override
    public String getTipoPan() {
        return "Pan sencillo";
    }
}
