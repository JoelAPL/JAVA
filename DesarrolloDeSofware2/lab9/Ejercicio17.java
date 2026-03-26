package lab9;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = scanner.nextLine();
        System.out.println("El número decimal equivalente es: " + binarioADecimal(binario));
    }

    public static int binarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }
}

