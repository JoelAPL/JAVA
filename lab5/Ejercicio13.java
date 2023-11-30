package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Introduce tres números enteros:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(numeros));

        scanner.close();
    }
}
