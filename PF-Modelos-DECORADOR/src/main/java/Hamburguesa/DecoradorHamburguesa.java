package Hamburguesa;

public abstract class DecoradorHamburguesa implements Hamburguesa {
    protected Hamburguesa hamburguesaDecorada;
    
    public DecoradorHamburguesa(Hamburguesa hamburguesaDecorada) {
        this.hamburguesaDecorada = hamburguesaDecorada;
    }
    
    @Override
    public String getDescripcion() {
        return hamburguesaDecorada.getDescripcion();
    }
    
    @Override
    public double getCosto() {
        return hamburguesaDecorada.getCosto();
    }
}
