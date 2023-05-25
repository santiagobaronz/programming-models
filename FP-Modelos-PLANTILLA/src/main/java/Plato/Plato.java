package Plato;

public abstract class Plato {
    
    public final void preparar() {
        cortarIngredientes();
        cocinar();
        servir();
    }

    protected abstract void cortarIngredientes();
    protected abstract void cocinar();
    protected abstract void servir();
}
