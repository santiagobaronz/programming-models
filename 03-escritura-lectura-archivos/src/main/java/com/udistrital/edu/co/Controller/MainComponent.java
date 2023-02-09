/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.udistrital.edu.co.Controller;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class MainComponent {

    public void gettingFile(String fileName) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        String answer = "0";
        System.out.println("Ruta de archivo obtenido correctamente");
        
        while (answer != "3") {
            
            System.out.println("----------------------------------");
            System.out.println("Seleccione 1 para leer el archivo");
            System.out.println("Seleccione 2 para escribir el archivo");
            System.out.println("Seleccione 3 para finalizar la app");
            System.out.print("Respuesta: ");
            answer = scanner.nextLine();
            System.out.println("----------------------------------");

            switch (answer) {
                case "1":
                    System.out.println("Se leera el archivo");

                    readFile readFile = new readFile();
                    readFile.readFile(fileName);

                    break;
                case "2":

                    System.out.print("Texto a escribir: ");
                    String textToWrite = scanner.nextLine();

                    writeFile writeFile = new writeFile();
                    writeFile.writeFile(fileName, textToWrite);

                    break;
                case "3":
                    System.out.println("App finalizada");
                    System.exit(0);
                    break;    
                default:
                    throw new AssertionError();
            }
            
        }
    }
}
