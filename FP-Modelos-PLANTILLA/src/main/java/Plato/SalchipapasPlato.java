package Plato;

public class SalchipapasPlato extends Plato {
    protected void cortarIngredientes() {
        System.out.println("Se cortan las salchichas y papas");
    }

    protected void cocinar() {
        System.out.println("Se fritan las salchichas y papas");
    }

    protected void servir() {
        System.out.println("Servir las papas con las salchichas ");
    }
}
