package lab6;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        while (numero <= 0) {
            System.out.println("Por favor, introduce un número positivo: ");
            numero = scanner.nextInt();
        }

        for (int i = 1; i <= 100; i++) {
            total += numero + i;
        }

        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + total);

        scanner.close();
    }
}
