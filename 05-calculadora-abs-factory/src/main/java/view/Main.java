package view;

import controller.MathController;
import factory.DivideFactory;
import factory.MathFactory;
import factory.MultiplyFactory;
import factory.SubtractFactory;
import factory.SumFactory;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        while (!operation.equals("5")) {
            System.out.println("Escoje una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir de la app");
            System.out.print("Respuesta: ");
            operation = scanner.nextLine();
            
            if (operation.equals("5")) {
                System.out.println("App finalizada");
                System.exit(0);
            }
            
            int a, b;
            System.out.print("Ingresar el primer numero: ");
            a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingresar el segundo numero: ");
            b = scanner.nextInt();
            scanner.nextLine();
            
            switch (operation) {
                case "1":
                    MathFactory mathFactory = new SumFactory();
                    MathController mathController = new MathController(mathFactory);
                    mathController.performMathOperation(a, b);
                    break;
                case "2":
                    mathFactory = new SubtractFactory();
                    mathController = new MathController(mathFactory);
                    mathController.performMathOperation(a, b);
                    break;
                case "3":
                    mathFactory = new MultiplyFactory();
                    mathController = new MathController(mathFactory);
                    mathController.performMathOperation(a, b);
                    break;
                case "4":
                    mathFactory = new DivideFactory();
                    mathController = new MathController(mathFactory);
                    mathController.performMathOperation(a, b);
                    break;
                default:
                    System.out.println("Ese numero no es una respuesta valida");
                    break;
            }
        }
    }
}