package Main;

import PatronPlantilla.EjemploPlantillaObjectStream;

public class Main {

    public static void main(String[] args) {
        String fileName = "miArchivo.dat";
        String miCadena = "Hola mundo";

        EjemploPlantillaObjectStream ejemplo = new EjemploPlantillaObjectStream();
        ejemplo.guardarObjeto(fileName, miCadena);
        String miCadenaLeida = (String) ejemplo.cargarObjeto(fileName);
        ejemplo.procesarObjeto(miCadenaLeida);
    }
}
