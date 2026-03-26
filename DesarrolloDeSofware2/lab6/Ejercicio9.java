package lab6;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = Math.abs(scanner.nextInt());

        int digitos = 1;
        while (numero >= 10) {
            numero /= 10;
            digitos++;
        }

        System.out.println("El número tiene " + digitos + " dígitos.");

        scanner.close();
    }
}

