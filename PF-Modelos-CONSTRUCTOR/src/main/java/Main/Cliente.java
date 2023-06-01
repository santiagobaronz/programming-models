package Main;

import Cocina.ComidaCombinada;
import Concretas.ConstructorComidaConcreto;
import Concretas.DirectorComida;

public class Cliente {
    public void cliente(){
        DirectorComida director = new DirectorComida();
        ConstructorComidaConcreto constructor = new ConstructorComidaConcreto();

        director.setConstructor(constructor);
        ComidaCombinada comida = director.construirComida();

        comida.mostrarComida();
    }
}
