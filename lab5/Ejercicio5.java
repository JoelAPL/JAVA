package lab5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a en la ecuación ax + b = 0: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el valor de b en la ecuación ax + b = 0: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solucion = -b / a;
            System.out.println("La solución de la ecuación es x = " + solucion);
        } else {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        }

        scanner.close();
    }
}
