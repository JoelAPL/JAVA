package lab7;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;
        int min = 0, max = 100;

        System.out.println("Piensa en un número entre 0 y 100.");

        for (int i = 1; i <= intentos; i++) {
            int intento = (min + max) / 2;
            System.out.println("¿Es " + intento + " el número que estás pensando? (s/n)");
            char respuesta = scanner.next().charAt(0);

            if (respuesta == 's') {
                System.out.println("¡He adivinado el número en " + i + " intentos!");
                break;
            } else {
                System.out.println("¿El número que estás pensando es mayor o menor que " + intento + "? (mayor/menor)");
                String indicacion = scanner.next();

                if (indicacion.equals("mayor")) {
                    min = intento + 1;
                } else {
                    max = intento - 1;
                }
            }

            if (i == intentos) {
                System.out.println("No he logrado adivinar el número en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }
}
