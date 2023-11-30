package lab5;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero de hasta 5 cifras: ");
        int numero = scanner.nextInt();

        int primeraCifra = 0;

        if (numero < 0) {
            numero = Math.abs(numero);
        }

        if (numero < 10) {
            primeraCifra = numero;
        } else if (numero < 100) {
            primeraCifra = numero / 10;
        } else if (numero < 1000) {
            primeraCifra = numero / 100;
        } else if (numero < 10000) {
            primeraCifra = numero / 1000;
        } else if (numero < 100000) {
            primeraCifra = numero / 10000;
        }

        System.out.println("La primera cifra del número es: " + primeraCifra);

        scanner.close();
    }
}

