package lab6;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para mostrar los términos de la serie de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        scanner.close();
    }
}

