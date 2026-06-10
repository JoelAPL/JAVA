package lab5;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día de la semana (de lunes a viernes): ");
        String diaSemana = scanner.nextLine().toLowerCase();

        System.out.print("Introduce la hora (horas y minutos): ");
        int horas = scanner.nextInt();
        int minutos = scanner.nextInt();

        int minutosHastaFinDeSemana = 0;

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
                minutosHastaFinDeSemana = ((4 - obtenerNumeroDia(diaSemana)) * 24 * 60) + ((15 - horas) * 60 - minutos);
                break;
            case "jueves":
            case "viernes":
                minutosHastaFinDeSemana = ((5 - obtenerNumeroDia(diaSemana)) * 24 * 60) + ((15 - horas) * 60 - minutos);
                break;
            default:
                System.out.println("Día no válido.");
                break;
        }

        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");

        scanner.close();
    }

    private static int obtenerNumeroDia(String dia) {
        switch (dia) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miércoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            default:
                return 0;
        }
    }
}
