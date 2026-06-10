package lab6;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int countDigitos = 0;
        int sumaMultiplos = 0;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 3 == 0) {
                System.out.print(digito + " ");
                countDigitos++;
                sumaMultiplos += digito;
            }
            numero /= 10;
        }

        System.out.println("\nCantidad de dígitos múltiplos de 3: " + countDigitos);
        System.out.println("Suma de los dígitos múltiplos de 3: " + sumaMultiplos);

        scanner.close();
    }
}
