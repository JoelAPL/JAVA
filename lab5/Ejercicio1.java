package lab5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String diaSemana = scanner.nextLine().toLowerCase();

        switch (diaSemana) {
            case "lunes":
                System.out.println("A primera hora toca Matemáticas.");
                break;
            case "martes":
                System.out.println("A primera hora toca Lengua.");
                break;
            case "miércoles":
                System.out.println("A primera hora toca Historia.");
                break;
            case "jueves":
                System.out.println("A primera hora toca Ciencias Naturales.");
                break;
            case "viernes":
                System.out.println("A primera hora toca Educación Física.");
                break;
            default:
                System.out.println("No es un día válido.");
        }

        scanner.close();
    }
}

