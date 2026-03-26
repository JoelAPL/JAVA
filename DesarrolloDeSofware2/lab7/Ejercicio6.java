package lab7;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 101);

        System.out.println("Intenta adivinar el número secreto (entre 0 y 100). Tienes 5 oportunidades.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Intento " + i + ": ");
            int intento = scanner.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Has adivinado el número.");
                break;
            } else {
                System.out.println("Incorrecto. Te quedan " + (5 - i) + " oportunidades.");

                if (intento < numeroSecreto) {
                    System.out.println("El número secreto es mayor.");
                } else {
                    System.out.println("El número secreto es menor.");
                }
            }

            if (i == 5) {
                System.out.println("¡Agotaste tus oportunidades! El número secreto era " + numeroSecreto);
            }
        }

        scanner.close();
    }
}

