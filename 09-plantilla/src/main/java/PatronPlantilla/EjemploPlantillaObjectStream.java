package PatronPlantilla;

public class EjemploPlantillaObjectStream extends PlantillaObjectStream {
    @Override
    public void procesarObjeto(Object obj) {
        String miCadena = (String) obj;
        System.out.println("Procesando objeto: " + miCadena);
    }
}
