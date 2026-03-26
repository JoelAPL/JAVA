package lab5;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            System.out.println("Tu horóscopo es Aries.");
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            System.out.println("Tu horóscopo es Tauro.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Tu horóscopo es Géminis.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Tu horóscopo es Cáncer.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Tu horóscopo es Leo.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Tu horóscopo es Virgo.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Tu horóscopo es Libra.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Tu horóscopo es Escorpio.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Tu horóscopo es Sagitario.");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Tu horóscopo es Capricornio.");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Tu horóscopo es Acuario.");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Tu horóscopo es Piscis.");
        } else {
            System.out.println("Fecha no válida.");
        }

        scanner.close();
    }
}
