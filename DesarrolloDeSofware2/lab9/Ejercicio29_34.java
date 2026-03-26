package lab9;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio29_34 {

    public static void main(String[] args) {
        // Ejemplo de uso de las funciones para arrays bidimensionales
        int[][] arrayBi = generaArrayBiInt(4, 3, 1, 100);
        System.out.println("Array bidimensional generado:");
        mostrarArrayBiInt(arrayBi);

        int filaMostrar = 2;
        System.out.println("Fila " + filaMostrar + ": " + Arrays.toString(filaDeArrayBiInt(arrayBi, filaMostrar)));

        int columnaMostrar = 1;
        System.out.println("Columna " + columnaMostrar + ": " + Arrays.toString(columnaDeArrayBiInt(arrayBi, columnaMostrar)));

        int numeroBuscar = 42;
        int[] coordenadas = coordenadasEnArrayBiInt(arrayBi, numeroBuscar);
        System.out.println("Coordenadas del número " + numeroBuscar + ": " + Arrays.toString(coordenadas));

        System.out.println("¿El número " + numeroBuscar + " es punto de silla? " + esPuntoDeSilla(arrayBi, coordenadas));

        int[] diagonalNorOeste = diagonal(arrayBi, 2, 0, "nose");
        System.out.println("Diagonal noroeste desde la fila 2, columna 0: " + Arrays.toString(diagonalNorOeste));

        int[] diagonalNorEste = diagonal(arrayBi, 2, 0, "neso");
        System.out.println("Diagonal noreste desde la fila 2, columna 0: " + Arrays.toString(diagonalNorEste));
    }

    public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
        int[][] arrayBi = new int[filas][columnas];
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arrayBi[i][j] = random.nextInt(maximo - minimo + 1) + minimo;
            }
        }
        return arrayBi;
    }

    public static void mostrarArrayBiInt(int[][] arrayBi) {
        for (int i = 0; i < arrayBi.length; i++) {
            System.out.println(Arrays.toString(arrayBi[i]));
        }
    }

    public static int[] filaDeArrayBiInt(int[][] arrayBi, int fila) {
        return arrayBi[fila];
    }

    public static int[] columnaDeArrayBiInt(int[][] arrayBi, int columna) {
        int[] columnaArray = new int[arrayBi.length];
        for (int i = 0; i < arrayBi.length; i++) {
            columnaArray[i] = arrayBi[i][columna];
        }
        return columnaArray;
    }

    public static int[] coordenadasEnArrayBiInt(int[][] arrayBi, int numero) {
        for (int i = 0; i < arrayBi.length; i++) {
            for (int j = 0; j < arrayBi[i].length; j++) {
                if (arrayBi[i][j] == numero) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static boolean esPuntoDeSilla(int[][] arrayBi, int[] coordenadas) {
        int fila = coordenadas[0];
        int columna = coordenadas[1];
        int elemento = arrayBi[fila][columna];

        // Comprobar si es mínimo en la fila
        for (int j = 0; j < arrayBi[fila].length; j++) {
            if (arrayBi[fila][j] < elemento) {
                return false;
            }
        }

        // Comprobar si es máximo en la columna
        for (int i = 0; i < arrayBi.length; i++) {
            if (arrayBi[i][columna] > elemento) {
                return false;
            }
        }

        return true;
    }

    public static int[] diagonal(int[][] arrayBi, int fila, int columna, String direccion) {
        int tamañoDiagonal = Math.min(arrayBi.length - fila, arrayBi[0].length - columna);
        int[] diagonalArray = new int[tamañoDiagonal];
        if (direccion.equals("nose")) {
            for (int i = 0; i < tamañoDiagonal; i++) {
                diagonalArray[i] = arrayBi[fila + i][columna + i];
            }
        } else if (direccion.equals("neso")) {
            for (int i = 0; i < tamañoDiagonal; i++) {
                diagonalArray[i] = arrayBi[fila + i][columna - i];
            }
        }
        return diagonalArray;
    }
}
