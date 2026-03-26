package lab6;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la altura de la L: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= altura / 2 + 1; i++) {
            System.out.print("* ");
        }

        scanner.close();
    }
}
