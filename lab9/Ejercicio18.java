package lab9;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int decimal = scanner.nextInt();
        System.out.println("El número binario equivalente es: " + decimalABinario(decimal));
    }

    public static String decimalABinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}

