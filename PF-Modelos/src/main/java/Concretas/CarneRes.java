package Concretas;

import Abstractas.Carne;

public class CarneRes implements Carne {
    @Override
    public String getTipoCarne() {
        return "Carne de res";
    }
}
