package lab5;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntos = 0;

        System.out.println("Test de Infidelidad");
        System.out.println("Responde Verdadero (V) o Falso (F)");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. ");
        String respuesta1 = scanner.next().toUpperCase();
        if (respuesta1.equals("V")) {
            puntos += 3;
        }

        System.out.print("2. Ha aumentado sus gastos de vestuario. ");
        String respuesta2 = scanner.next().toUpperCase();
        if (respuesta2.equals("V")) {
            puntos += 3;
        }

        // Agrega más preguntas según sea necesario

        System.out.println("Tu puntuación es: " + puntos);

        if (puntos >= 6) {
            System.out.println("Probablemente tu pareja te está siendo infiel.");
        } else {
            System.out.println("Es poco probable que tu pareja te esté siendo infiel.");
        }

        scanner.close();
    }
}

