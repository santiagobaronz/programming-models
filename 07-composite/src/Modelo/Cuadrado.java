package Modelo;

public class Cuadrado implements Figura {
    
    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado con lado " + lado);
    }

    @Override
    public void girar() {
        System.out.println("Girando el cuadrado");
    }

    @Override
    public void mover() {
        System.out.println("Moviendo el cuadrado");
    }
}
