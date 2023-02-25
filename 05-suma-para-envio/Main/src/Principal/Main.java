package Principal;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        // Seleccionador de operacion por pantall, archivo o interfaz
        //cliente.operacionPorPantalla();
        cliente.operacionPorArchivo();
        //cliente.operacionPorInterfaz();

    }
}
