package lab5;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntos = 0;

        System.out.println("Minicuestionario sobre asignaturas:");
        System.out.println("1. ¿Cuál es la capital de Francia?");
        String respuesta1 = scanner.nextLine();
        if (respuesta1.equalsIgnoreCase("París")) {
            puntos++;
        }

        System.out.println("2. ¿Cuál es la fórmula química del agua?");
        String respuesta2 = scanner.nextLine();
        if (respuesta2.equalsIgnoreCase("H2O")) {
            puntos++;
        }

        // Agrega más preguntas según sea necesario

        System.out.println("Tu calificación es: " + puntos + " puntos.");

        scanner.close();
    }
}
