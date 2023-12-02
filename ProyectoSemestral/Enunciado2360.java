package ProyectoSemestral;

import java.util.Scanner;

public class Enunciado2360 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer valores ini y fin del usuario
        System.out.println("Ingrese el valor inicial (ini):");
        int ini = scanner.nextInt();

        System.out.println("Ingrese el valor final (fin) mayor que ini:");
        int fin;
        do {
            fin = scanner.nextInt();
            if (fin <= ini) {
                System.out.println("El valor final debe ser mayor que el valor inicial. Ingrese nuevamente:");
            }
        } while (fin <= ini);

        // Mostrar listado de valores, sumatoria y promedio
        System.out.println("\nListado de los valores enteros entre " + ini + " y " + fin + ":");

        int sumatoria = 0;
        int cantidad = 0;

        for (int i = ini; i <= fin; i++) {
            System.out.print(i + "\t");

            sumatoria += i;
            cantidad++;

            // Mostrar 6 valores por línea
            if (cantidad % 6 == 0) {
                System.out.println();
            }
        }

        // Calcular y mostrar sumatoria y promedio
        double promedio = (double) sumatoria / cantidad;
        System.out.println("\n\nSon " + cantidad + " elementos");
        System.out.println("La sumatoria es: " + sumatoria);
        System.out.println("El promedio es: " + promedio);

        // Cerrar el scanner
        scanner.close();
    }
}
