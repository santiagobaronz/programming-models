package Modelo;

public class Romboide implements Figura {
    public double lado;

    public Romboide(double base) {
        this.lado = lado;
    }

    public void dibujar() {
        System.out.println("Dibujando un triángulo con lados " + lado);
    }

    public void girar() {
        System.out.println("Girando el romboide");
    }

    public void mover() {
        System.out.println("Moviendo el romboide");
    }
}
