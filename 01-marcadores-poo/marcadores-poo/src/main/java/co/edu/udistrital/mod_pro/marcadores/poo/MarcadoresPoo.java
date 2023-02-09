/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udistrital.mod_pro.marcadores.poo;
import java.util.Scanner;

public class MarcadoresPoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tipo de tapa: ");
        String tapa = scanner.nextLine();
        System.out.print("Ingresa el tipo de cuerpo: ");
        String cuerpo = scanner.nextLine();
        System.out.print("Ingresa el contenido en tinta (0-100): ");
        int contenido = scanner.nextInt();
        scanner.close();

        Marcador marcador = new Marcador(tapa, cuerpo, contenido + "%");
        System.out.println(marcador);
    }
}