package ProyectoSemestral;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

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
        for (int num : muestra) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Paso 3: Calcular y mostrar la moda
        List<Integer> moda = calcularModa(muestra);
        System.out.println("\nModa del conjunto:");
        for (int num : moda) {
            System.out.println(num);
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para generar aleatoriamente un número entre w y x (ambos inclusive)
    private static int generarAleatorio(int w, int x) {
        return (int) (Math.random() * (x - w + 1) + w);
    }

    // Método para calcular la moda de un conjunto de datos y devolver una lista con los números que más se repiten
    private static List<Integer> calcularModa(int[] muestra) {
        Arrays.sort(muestra);
        Map<Integer, Integer> frecuenciaMapa = new HashMap<>();

        for (int i = 0; i < muestra.length; i++) {
            int numero = muestra[i];
            frecuenciaMapa.put(numero, frecuenciaMapa.getOrDefault(numero, 0) + 1);
        }

        List<Integer> moda = new ArrayList<>();
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuenciaMapa.entrySet()) {
            int numero = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia > maxFrecuencia) {
                moda.clear();
                moda.add(numero);
                maxFrecuencia = frecuencia;
            } else if (frecuencia == maxFrecuencia) {
                moda.add(numero);
            }
        }

        return moda;
    }
}
