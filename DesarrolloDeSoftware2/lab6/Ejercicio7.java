package lab6;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int combinacion = 1234;
        int intentos = 4;

        while (intentos > 0) {
            System.out.print("Introduce la combinación: ");
            int input = scanner.nextInt();

            if (input == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--;
                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Te has quedado sin intentos. La caja fuerte permanece cerrada.");
                }
            }
        }

        scanner.close();
    }
}

