package Plato;

public class PataconesPlato extends Plato {
    protected void cortarIngredientes() {
        System.out.println("Se cortan los platanos.");
    }

    protected void cocinar() {
        System.out.println("Cortar y fritar los platanos");
    }

    protected void servir() {
        System.out.println("Servir los platanos con sal.");
    }
}
