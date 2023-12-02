package lab6;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero (distinto al primero): ");
        int num2 = scanner.nextInt();

        while (num1 == num2) {
            System.out.println("Por favor, introduce un número distinto al primero: ");
            num2 = scanner.nextInt();
        }

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}
