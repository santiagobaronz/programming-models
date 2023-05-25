package Decoradores;

import Hamburguesa.DecoradorHamburguesa;
import Hamburguesa.Hamburguesa;

public class QuesoExtra extends DecoradorHamburguesa {
    public QuesoExtra(Hamburguesa hamburguesaDecorada) {
        super(hamburguesaDecorada);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", queso extra";
    }
    
    @Override
    public double getCosto() {
        return super.getCosto() + 1.0;
    }
}
