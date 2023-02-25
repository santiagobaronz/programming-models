package Entradas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EntradaArchivo extends EntradaAbstracta {

    private String number1;
    private String number2;

    public String getA() {
        return number1;
    }

    public void setA(String propNumber) {
        this.number1 = propNumber;
    }

    public String getB() {
        return number2;
    }

    public void setB(String propNumber) {
        this.number2 = propNumber;
    }

    @Override
    public String entrada() {

        String ruta = "D:\\Operaciones.txt";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        number1 = sc.nextLine();
        setA(number1);

        System.out.println("Ingrese un numero: ");
        number2 = sc.nextLine();
        setB(number2);

        try {
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(ruta);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(number1);
            bufferedWriter.write(number2);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
