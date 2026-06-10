package lab5;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un carácter para la pirámide: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("Elige la orientación de la pirámide:");
        System.out.println("1. Vértice hacia arriba");
        System.out.println("2. Vértice hacia abajo");
        System.out.println("3. Vértice hacia la izquierda");
        System.out.println("4. Vértice hacia la derecha");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        System.out.println("Pirámide:");

        switch (opcion) {
            case 1:
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;
            case 2:
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println("  " + caracter);
                break;
            case 3:
                System.out.println("    " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println(caracter + " " + caracter + " " + caracter);
                System.out.println("  " + caracter + " " + caracter);
                System.out.println("    " + caracter);
                break;
            case 4:
                System.out.println("  " + caracter + "  ");
                System.out.println(" " + caracter + caracter + " ");
                System.out.println(caracter + caracter + caracter);
                System.out.println(" " + caracter + caracter + " ");
                System.out.println("  " + caracter + "  ");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
