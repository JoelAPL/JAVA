package lab5;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a en la ecuación ax^2 + bx + c = 0: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el valor de b en la ecuación ax^2 + bx + c = 0: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el valor de c en la ecuación ax^2 + bx + c = 0: ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (a != 0) {
            if (discriminante > 0) {
                double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones de la ecuación son x1 = " + solucion1 + " y x2 = " + solucion2);
            } else if (discriminante == 0) {
                double solucion = -b / (2 * a);
                System.out.println("La única solución de la ecuación es x = " + solucion);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        } else {
            System.out.println("No es una ecuación de segundo grado.");
        }

        scanner.close();
    }
}

