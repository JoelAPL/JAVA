package lab6;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para mostrarlo al revés: ");
        int numero = scanner.nextInt();

        int resultado = 0;

        while (numero != 0) {
            int digito = numero % 10;
            resultado = resultado * 10 + digito;
            numero /= 10;
        }

        System.out.println("El número al revés es: " + resultado);

        scanner.close();
    }
}
