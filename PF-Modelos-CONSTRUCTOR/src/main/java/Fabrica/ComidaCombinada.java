package Cocina;

public class ComidaCombinada {
    private String hamburguesa;
    private String papasFritas;
    private String bebida;

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
        System.out.println("Hamburguesa: " + hamburguesa);
        System.out.println("Papas Fritas: " + papasFritas);
        System.out.println("Bebida: " + bebida);
    }
}
