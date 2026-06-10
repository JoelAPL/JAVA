package lab8;

import java.util.Scanner;

public class EjerciciosBidimensionales {
    public static void main(String[] args) {
        // Ejercicio 1
        int[][] num = {
            {0, 1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10, 11},
            {12, 13, 14, 15, 16, 17}
        };
        mostrarArrayBidimensional(num);

        // Ejercicio 2
        int[][] array20x4x5 = leerArray(4, 5);
        mostrarSumasParciales(array20x4x5);

        // Ejercicio 3
        int[][] arrayAleatorio = generarArrayAleatorio(6, 10, 100, 999);
        mostrarArrayBidimensional(arrayAleatorio);

        // Ejercicio 4
        mostrarSumasParcialesConRetardo(arrayAleatorio);

        // Ejercicio 5
        encontrarMaximoYMinimo(arrayAleatorio);

        // Ejercicio 6
        int[][] arraySinRepetir = generarArraySinRepetir(6, 10, 0, 1000);
        mostrarArrayBidimensional(arraySinRepetir);

        // Ejercicio 7
        mejorarBuscaElTesoro();

        // Ejercicio 8
        movimientoAlfilEnAjedrez();

    }

    private static void mostrarArrayBidimensional(int[][] array) {
        System.out.println("Array Bidimensional:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] leerArray(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    private static void mostrarSumasParciales(int[][] array) {
        System.out.println("\nSumas Parciales:");
        for (int i = 0; i < array.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumaFila += array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("| Suma Fila " + i + ": " + sumaFila);
        }

        System.out.println();
        int sumaTotal = 0;
        for (int j = 0; j < array[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < array.length; i++) {
                sumaColumna += array[i][j];
            }
            System.out.print("Suma Col " + j + ": " + sumaColumna + "\t");
            sumaTotal += sumaColumna;
        }
        System.out.println("\nSuma Total: " + sumaTotal);
    }

    private static int[][] generarArrayAleatorio(int filas, int columnas, int min, int max) {
        int[][] array = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = random.nextInt(max - min + 1) + min;
            }
        }

        return array;
    }

    private static void mostrarSumasParcialesConRetardo(int[][] array) {
        // Implementación del retardo
        try {
            Thread.sleep(1000); // Retardo de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Resto del código para mostrar las sumas parciales y totales
        System.out.println("\nSumas Parciales:");
        // ... (código anterior)
    }

    private static void encontrarMaximoYMinimo(int[][] array) {
        int maximo = array[0][0];
        int minimo = array[0][0];
        int filaMaximo = 0;
        int columnaMaximo = 0;
        int filaMinimo = 0;
        int columnaMinimo = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maximo) {
                    maximo = array[i][j];
                    filaMaximo = i;
                    columnaMaximo = j;
                }
                if (array[i][j] < minimo) {
                    minimo = array[i][j];
                    filaMinimo = i;
                    columnaMinimo = j;
                }
            }
        }

        System.out.println("\nMáximo en la posición [" + filaMaximo + "][" + columnaMaximo + "]: " + maximo);
        System.out.println("Mínimo en la posición [" + filaMinimo + "][" + columnaMinimo + "]: " + minimo);
    }

    private static int[][] generarArraySinRepetir(int filas, int columnas, int min, int max) {
        if ((max - min + 1) < (filas * columnas)) {
            throw new IllegalArgumentException("No hay suficientes números para llenar el array sin repetir.");
        }

        int[][] array = new int[filas][columnas];
        Random random = new Random();
        boolean[] numerosUsados = new boolean[max - min + 1];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numeroAleatorio;
                do {
                    numeroAleatorio = random.nextInt(max - min + 1) + min;
                } while (numerosUsados[numeroAleatorio - min]);
                numerosUsados[numeroAleatorio - min] = true;
                array[i][j] = numeroAleatorio;
            }
        }

        return array;
    }

    private static void mejorarBuscaElTesoro() {
        // Implementación del juego mejorado "Busca el tesoro"
    }

    private static void movimientoAlfilEnAjedrez() {
        // Implementación del movimiento del alfil en ajedrez
    }
}