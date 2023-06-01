package Main;

import Decoradores.QuesoExtra;
import Decoradores.TocinoExtra;
import EntradaSalidaPF.SalidaConcreta;
import Hamburguesa.Hamburguesa;
import Hamburguesa.HamburguesaBasica;


public class Cliente {

    public void iniciarCliente() {
        Hamburguesa hamburguesa = new HamburguesaBasica();
        
        SalidaConcreta retornar = new SalidaConcreta();


        hamburguesa = new QuesoExtra(hamburguesa);

        hamburguesa = new TocinoExtra(hamburguesa);

        retornar.salida("Descripción: " + hamburguesa.getDescripcion());
        retornar.salida("Costo: $" + hamburguesa.getCosto());
    }
}
