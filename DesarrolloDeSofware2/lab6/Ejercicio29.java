package lab6;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int limiteSuperior = scanner.nextInt();

        System.out.print("Introduce otro número (divisor): ");
        int divisor = scanner.nextInt();

        System.out.println("Números enteros positivos menores a " + limiteSuperior +
                " no divisibles entre " + divisor + ":");

        for (int i = 1; i < limiteSuperior; i++) {
            if (i % divisor != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
