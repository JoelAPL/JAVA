package ProyectoSemestral;

import java.util.Arrays;
import java.util.Scanner;

public class Enunciado3345 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Generar aleatoriamente un conjunto de datos
        System.out.println("Ingrese el valor mínimo (w):");
        int w = scanner.nextInt();

        System.out.println("Ingrese el valor máximo (x) mayor que w:");
        int x;
        do {
            x = scanner.nextInt();
            if (x <= w) {
                System.out.println("El valor máximo debe ser mayor que el valor mínimo. Ingrese nuevamente:");
            }
        } while (x <= w);

        System.out.println("Ingrese la cantidad de elementos en el conjunto (n):");
        int n = scanner.nextInt();

        // Generar aleatoriamente el conjunto de datos
        int[] muestra = new int[n];
        for (int i = 0; i < n; i++) {
            muestra[i] = generarAleatorio(w, x);
        }

        // Paso 2: Imprimir los valores generados
        System.out.println("\nValores generados en el conjunto (muestra):");
        imprimirArreglo(muestra);

        // Paso 3: Calcular y mostrar la moda
        int[] moda = calcularModa(muestra);
        System.out.println("\n\nModa del conjunto:");
        imprimirArreglo(moda);

        // Cerrar el scanner
        scanner.close();
    }

    // Método para generar aleatoriamente un número entre w y x (ambos inclusive)
    private static int generarAleatorio(int w, int x) {
        return (int) (Math.random() * (x - w + 1) + w);
    }

    // Método para imprimir un arreglo de enteros
    private static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Método para calcular la moda de un conjunto de datos
    private static int[] calcularModa(int[] muestra) {
        Arrays.sort(muestra);
        int maxFrecuencia = 1;
        int frecuenciaActual = 1;
        int modaActual = muestra[0];

        for (int i = 1; i < muestra.length; i++) {
            if (muestra[i] == muestra[i - 1]) {
                frecuenciaActual++;
            } else {
                frecuenciaActual = 1;
            }

            if (frecuenciaActual > maxFrecuencia) {
                maxFrecuencia = frecuenciaActual;
                modaActual = muestra[i];
            }
        }

        int cantidadModa = 0;
        for (int i = 0; i < muestra.length; i++) {
            if (muestra[i] == modaActual) {
                cantidadModa++;
            }
        }

        int[] moda = new int[cantidadModa];
        int index = 0;
        for (int i = 0; i < muestra.length; i++) {
            if (muestra[i] == modaActual) {
                moda[index] = muestra[i];
                index++;
            }
        }

        return moda;
    }
}

