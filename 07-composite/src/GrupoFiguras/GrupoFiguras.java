/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GrupoFiguras;

import Modelo.Cuadrado;
import Modelo.Figura;
import Modelo.Triangulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class GrupoFiguras implements Figura {
    private List<Figura> figuras = new ArrayList<>();

    public void dibujar() {
        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }

    public void agregar(Figura figura) {
        figuras.add(figura);
    }

    public void remover(Figura figura) {
        figuras.remove(figura);
    }

    public void girar() {
        for (Figura figura : figuras) {
            figura.girar();
        }
    }

    public void mover() {
        for (Figura figura : figuras) {
            figura.mover();
        }
    }

    public double calcularArea() {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            if (figura instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) figura;
                areaTotal += (triangulo.base * triangulo.altura) / 2;
            } else if (figura instanceof Cuadrado) {
                Cuadrado cuadrado = (Cuadrado) figura;
                areaTotal += cuadrado.lado * cuadrado.lado;
            }
        }
        return areaTotal;
    }
}
