package lab6;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

        scanner.close();
    }
}

