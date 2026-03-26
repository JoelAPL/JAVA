package lab9;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = scanner.nextLine();

        // Determinar la base del número
        int baseOrigen = determinarBase(numero);

        // Convertir el número a decimal
        int decimal = convertirADecimal(numero, baseOrigen);

        // Mostrar el número decimal
        System.out.println("Número en decimal: " + decimal);

        // Convertir el número a binario
        String binario = decimalABinario(decimal);
        System.out.println("Número en binario: " + binario);

        // Convertir el número a hexadecimal
        String hexadecimal = decimalAHexadecimal(decimal);
        System.out.println("Número en hexadecimal: " + hexadecimal);

        // Convertir el número a octal
        String octal = decimalAOctal(decimal);
        System.out.println("Número en octal: " + octal);
    }

    public static int determinarBase(String numero) {
        if (numero.matches("[01]+")) {
            return 2; // Binario
        } else if (numero.matches("[0-7]+")) {
            return 8; // Octal
        } else if (numero.matches("[0-9]+")) {
            return 10; // Decimal
        } else if (numero.matches("[0-9A-Fa-f]+")) {
            return 16; // Hexadecimal
        } else {
            System.out.println("Formato de número no reconocido.");
            System.exit(1);
            return -1;
        }
    }

    public static int convertirADecimal(String numero, int baseOrigen) {
        return Integer.parseInt(numero, baseOrigen);
    }

    public static String decimalABinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String decimalAHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String decimalAOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}

