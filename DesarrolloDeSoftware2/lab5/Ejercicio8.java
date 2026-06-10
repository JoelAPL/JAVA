package lab5;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media de las tres notas es: " + media);

        if (media < 5) {
            System.out.println("Nota del boletín: Insuficiente");
        } else if (media < 6) {
            System.out.println("Nota del boletín: Suficiente");
        } else if (media < 7) {
            System.out.println("Nota del boletín: Bien");
        } else if (media < 9) {
            System.out.println("Nota del boletín: Notable");
        } else {
            System.out.println("Nota del boletín: Sobresaliente");
        }

        scanner.close();
    }
}
