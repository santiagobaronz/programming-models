package Modelo;

public class Triangulo implements Figura {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void dibujar() {
        System.out.println("Dibujando un triángulo con base " + base + " y altura " + altura);
    }

    public void girar() {
        System.out.println("Girando el triángulo");
    }

    public void mover() {
        System.out.println("Moviendo el triángulo");
    }
}
