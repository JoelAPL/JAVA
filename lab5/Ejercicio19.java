package lab5;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero de hasta 5 dígitos: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = (int) Math.log10(Math.abs(numero)) + 1;

        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");

        scanner.close();
    }
}

