package Principal;

import Entradas.EntradaAbstracta;
import Entradas.EntradaArchivo;
import Fabricas.FabricaESAbstracta;
import Fabricas.FabricaESArchivo;
import Fabricas.FabricaESInterfaz;
import Fabricas.FabricaESPantalla;
import Operacion.OperacionAbstracta;
import Salidas.SalidaAbstracta;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cliente {

    public void operacionPorPantalla() {

        FabricaESAbstracta fabricaES = new FabricaESPantalla();
        EntradaAbstracta objEntrada = fabricaES.entrada();

        OperacionAbstracta objOperacion = fabricaES.operacion();
        int resultado = objOperacion.operacionSuma(Integer.parseInt(objEntrada.entrada()), Integer.parseInt(objEntrada.entrada()));

        SalidaAbstracta objSalida = fabricaES.salida();
        objSalida.out(String.valueOf(resultado));
    }

    public void operacionPorArchivo() {

        String ruta = "D:\\Operaciones.txt";

        FabricaESAbstracta fabricaES = new FabricaESArchivo();
        EntradaArchivo objEntrada = new EntradaArchivo();

        objEntrada.entrada();
        OperacionAbstracta objOperacion = fabricaES.operacion();

        int resultado = objOperacion.operacionSuma(Integer.parseInt(objEntrada.getA()), Integer.parseInt(objEntrada.getB()));

        SalidaAbstracta objSalida = fabricaES.salida();

        try {

            File file = new File(ruta);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(ruta);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Numero 1: " + objEntrada.getA());
            bufferedWriter.write("\nNumero2: " + objEntrada.getB());
            bufferedWriter.write("\nResultado: " + String.valueOf(resultado));
            bufferedWriter.close();

        } catch (IOException e) {
            objSalida.out("Se ha producido un error con el archivo");
        }

        objSalida.out(String.valueOf(resultado));

    }

    public void operacionPorInterfaz() {

        FabricaESAbstracta fabricaES = new FabricaESInterfaz();
        EntradaAbstracta objEntrada = fabricaES.entrada();

        OperacionAbstracta objOperacion = fabricaES.operacion();
        int resultado = objOperacion.operacionSuma(Integer.parseInt(objEntrada.entrada()), Integer.parseInt(objEntrada.entrada()));

        SalidaAbstracta objSalida = fabricaES.salida();
        objSalida.out(String.valueOf(resultado));

    }
}
