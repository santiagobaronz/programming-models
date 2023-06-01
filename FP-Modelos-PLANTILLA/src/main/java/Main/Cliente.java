package Main;

import EntradaSalidaPF.SalidaConcreta;
import Plato.PataconesPlato;
import Plato.Plato;
import Plato.SalchipapasPlato;

public class Cliente {

    public void iniciarCliente() {
        Plato salchipapas = new SalchipapasPlato();
        SalidaConcreta retornar = new SalidaConcreta();

        salchipapas.preparar();

        retornar.salida("------------------------");

        Plato patacones = new PataconesPlato();
        patacones.preparar();
    }
}
