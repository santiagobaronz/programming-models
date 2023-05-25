package Hamburguesa;

public class HamburguesaBasica implements Hamburguesa {
    @Override
    public String getDescripcion() {
        return "Hamburguesa básica";
    }
    
    @Override
    public double getCosto() {
        return 3.0;
    }
}
