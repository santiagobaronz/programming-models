package Main;

import Decoradores.QuesoExtra;
import Decoradores.TocinoExtra;
import Hamburguesa.Hamburguesa;
import Hamburguesa.HamburguesaBasica;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new HamburguesaBasica();
        
        hamburguesa = new QuesoExtra(hamburguesa);
        
        hamburguesa = new TocinoExtra(hamburguesa);
        
        System.out.println("Descripción: " + hamburguesa.getDescripcion());
        System.out.println("Costo: $" + hamburguesa.getCosto());
    }
}
