package lab6;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosIntroducidos = 0;
        int sumaImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        System.out.println("Introduce números (introduce un número negativo para terminar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            numerosIntroducidos++;

            if (numero % 2 == 0) {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            } else {
                sumaImpares += numero;
            }
        }

        if (numerosIntroducidos > 0) {
            double mediaImpares = (double) sumaImpares / (numerosIntroducidos / 2);
            System.out.println("Se introdujeron " + numerosIntroducidos + " números.");
            System.out.println("La media de los impares es: " + mediaImpares);
            System.out.println("El mayor de los pares es: " + (mayorPar == Integer.MIN_VALUE ? "No se introdujeron pares." : mayorPar));
        } else {
            System.out.println("No se introdujeron números.");
        }

        scanner.close();
    }
}
