package lab5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura desde la que cae el objeto (en metros): ");
        double altura = scanner.nextDouble();

        final double gravedad = 9.81;
        double tiempo = Math.sqrt((2 * altura) / gravedad);

        System.out.println("El tiempo que tardará en caer el objeto es: " + tiempo + " segundos.");

        scanner.close();
    }
}
