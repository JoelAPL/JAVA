package lab5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        final double salarioHoraNormal = 12;
        final double salarioHoraExtra = 16;
        final int horasNormales = 40;

        double salarioTotal = 0;

        if (horasTrabajadas <= horasNormales) {
            salarioTotal = horasTrabajadas * salarioHoraNormal;
        } else {
            salarioTotal = horasNormales * salarioHoraNormal + (horasTrabajadas - horasNormales) * salarioHoraExtra;
        }

        System.out.println("El salario semanal es: " + salarioTotal);

        scanner.close();
    }
}

