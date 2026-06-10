package lab6;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números hasta que la suma supere 10000 (introduce un número negativo para terminar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero;
            contador++;

            if (suma > 10000) {
                break;
            }
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La suma total es: " + suma);
            System.out.println("Se introdujeron " + contador + " números.");
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números.");
        }

        scanner.close();
    }
}
