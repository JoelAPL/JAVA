package lab5;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la hora actual (en formato 24 horas): ");
        int horaActual = scanner.nextInt();
        System.out.print("Introduce los minutos actuales: ");
        int minutosActuales = scanner.nextInt();

        final int horasEnUnDia = 24;
        final int minutosEnUnaHora = 60;
        int segundosHastaMedianoche = ((horasEnUnDia - horaActual - 1) * minutosEnUnaHora + (60 - minutosActuales)) * 60;

        System.out.println("Faltan " + segundosHastaMedianoche + " segundos para medianoche.");

        scanner.close();
    }
}
