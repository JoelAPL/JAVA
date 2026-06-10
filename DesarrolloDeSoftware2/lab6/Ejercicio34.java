package lab6;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        long numero = scanner.nextLong();

        long numeroPares = 0;
        long numeroImpares = 0;
        int longitud = (int) Math.log10(numero) + 1;

        for (int i = 0; i < longitud; i++) {
            long digito = numero % 10;

            if (i % 2 == 0) {
                numeroPares = numeroPares * 10 + digito;
            } else {
                numeroImpares = numeroImpares * 10 + digito;
            }

            numero /= 10;
        }

        System.out.println("El número formado por los dígitos pares es: " + numeroPares);
        System.out.println("El número formado por los dígitos impares es: " + numeroImpares);

        scanner.close();
    }
}
