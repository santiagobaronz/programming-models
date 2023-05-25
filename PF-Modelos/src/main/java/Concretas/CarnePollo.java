package Concretas;

import Abstractas.Carne;

public class CarnePollo implements Carne {
    @Override
    public String getTipoCarne() {
        return "Carne de pollo";
    }
}
