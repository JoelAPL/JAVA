package lab5;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int ultimaCifra = Math.abs(numero % 10);

        System.out.println("La última cifra del número es: " + ultimaCifra);

        scanner.close();
    }
}

