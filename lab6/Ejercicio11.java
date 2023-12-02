package lab6;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para comenzar la tabla: ");
        int inicio = scanner.nextInt();

        for (int i = inicio; i < inicio + 5; i++) {
            System.out.println(i + "\t" + i * i + "\t" + i * i * i);
        }

        scanner.close();
    }
}

