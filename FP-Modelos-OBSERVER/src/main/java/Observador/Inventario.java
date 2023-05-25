package Observador;

public class Inventario extends SujetoObservable {
    private boolean ingredienteAgotado;

    public void setIngredienteAgotado(boolean agotado) {
        this.ingredienteAgotado = agotado;
        notificarObservadores();
    }

    public boolean isIngredienteAgotado() {
        return ingredienteAgotado;
    }
}
