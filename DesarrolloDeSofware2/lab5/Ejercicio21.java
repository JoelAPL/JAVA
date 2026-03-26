package lab5;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota del primer control: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota del segundo control: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de Programación es " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String resultadoRecuperacion = scanner.next();

            if (resultadoRecuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota de Programación es 5");
            } else {
                System.out.println("Tu nota de Programación es " + media);
            }
        }

        scanner.close();
    }
}

