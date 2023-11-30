package lab5;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo de hasta 5 cifras: ");
        int numero = scanner.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        if (original == invertido) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }

        scanner.close();
    }
}

