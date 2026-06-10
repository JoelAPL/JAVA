package lab6;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int countMultiplos = 0;
        int sumaMultiplos = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                countMultiplos++;
                sumaMultiplos += i;
            }
        }

        System.out.println("\nCantidad de múltiplos de 3: " + countMultiplos);
        System.out.println("Suma de los múltiplos de 3: " + sumaMultiplos);

        scanner.close();
    }
}

