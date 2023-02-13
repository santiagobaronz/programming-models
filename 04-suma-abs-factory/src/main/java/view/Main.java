package view;

import controller.MathController;
import factory.MathFactory;
import factory.SumFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int b = scanner.nextInt();

        MathFactory sumFactory = new SumFactory();
        MathController mathController = new MathController(sumFactory);
        mathController.performMathOperation(a, b);
    }
}