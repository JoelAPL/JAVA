package lab6;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce un dígito: ");
        int digito = scanner.nextInt();

        String numeroStr = Integer.toString(numero);
        String digitoStr = Integer.toString(digito);

        if (numeroStr.contains(digitoStr)) {
            int posicion = numeroStr.indexOf(digitoStr) + 1;
            System.out.println("El dígito " + digito + " está en la posición " + posicion + " del número " + numero);
        } else {
            System.out.println("El dígito " + digito + " no está en el número " + numero);
        }

        scanner.close();
    }
}

