package Cocina;

import EntradaSalidaPF.SalidaConcreta;

public class ComidaCombinada {
    private String hamburguesa;
    private String papasFritas;
    private String bebida;
    
    SalidaConcreta retornar = new SalidaConcreta();
    
    public void setHamburguesa(String hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public void setPapasFritas(String papasFritas) {
        this.papasFritas = papasFritas;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void mostrarComida() {
        retornar.salida("Hamburguesa: " + hamburguesa);
        retornar.salida("Papas Fritas: " + papasFritas);
        retornar.salida("Bebida: " + bebida);
    }
}
