package Plato;

import EntradaSalidaPF.SalidaConcreta;

public class SalchipapasPlato extends Plato {
    SalidaConcreta retornar = new SalidaConcreta();

    protected void cortarIngredientes() {
        retornar.salida("Se cortan las salchichas y papas");
    }

    protected void cocinar() {
        retornar.salida("Se fritan las salchichas y papas");
    }

    protected void servir() {
        retornar.salida("Servir las papas con las salchichas ");
    }
}
