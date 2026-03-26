package lab6;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        System.out.println("Potencias de " + base + " hasta " + exponente + ":");

        for (int i = 1; i <= exponente; i++) {
            int resultado = 1;
            for (int j = 1; j <= i; j++) {
                resultado *= base;
            }
            System.out.println(resultado);
        }

        scanner.close();
    }
}
