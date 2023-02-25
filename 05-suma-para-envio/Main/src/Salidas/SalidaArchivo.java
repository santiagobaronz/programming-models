package Salidas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SalidaArchivo extends SalidaAbstracta {

    String ruta = "D:\\Operaciones.txt";

    @Override
    public void out(String resultado) {

        try {
            FileReader fileReader = new FileReader(ruta);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String infoArchivo = bufferedReader.readLine();

            while (infoArchivo != null) {
                System.out.println(infoArchivo);
                infoArchivo = bufferedReader.readLine();
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
