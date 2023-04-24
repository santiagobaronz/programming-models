package PatronPlantilla;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class PlantillaObjectStream {
    public final void guardarObjeto(String fileName, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(obj);
            System.out.println("Objeto escrito en archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final Object cargarObjeto(String fileName) {
        Object obj = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            obj = ois.readObject();
            System.out.println("Objeto leído desde archivo");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public abstract void procesarObjeto(Object obj);
}