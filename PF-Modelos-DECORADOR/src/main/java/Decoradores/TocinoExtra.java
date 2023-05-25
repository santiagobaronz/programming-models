package Decoradores;

import Hamburguesa.DecoradorHamburguesa;
import Hamburguesa.Hamburguesa;

public class TocinoExtra extends DecoradorHamburguesa {
    public TocinoExtra(Hamburguesa hamburguesaDecorada) {
        super(hamburguesaDecorada);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", tocino extra";
    }
    
    @Override
    public double getCosto() {
        return super.getCosto() + 1.5;
    }
}

