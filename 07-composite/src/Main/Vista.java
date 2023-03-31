package Main;

import GrupoFiguras.GrupoFiguras;
import Modelo.Cuadrado;
import Modelo.Figura;
import Modelo.Romboide;
import Modelo.Triangulo;

public class Vista {
    public static void main(String[] args) {
        // Creamos las figuras y las agregamos al grupo
    Figura cuadrado = new Cuadrado(5.0);
    Figura triangulo = new Triangulo(8,5);
    Figura romboide = new Romboide(2);
    GrupoFiguras grupo = new GrupoFiguras();
    grupo.agregar(cuadrado);
    grupo.agregar(triangulo);
    grupo.agregar(romboide);

    // Movemos y giramos las figuras
    cuadrado.mover();
    cuadrado.girar();
    triangulo.mover();
    triangulo.girar();
    romboide.mover();
    romboide.girar();

    // Dibujamos y calculamos el área del grupo
    grupo.dibujar();
    double areaGrupo = grupo.calcularArea();
    System.out.println("El área total del grupo es: " + areaGrupo);
        
    }
}
