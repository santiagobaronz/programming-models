package Entradas;

import java.util.Scanner;

public class EntradaPantalla extends EntradaAbstracta {

    @Override
    public String entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        return sc.nextLine();
    }
}
