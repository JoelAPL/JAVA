package lab9;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio20_28 {

    public static void main(String[] args) {
        // Ejemplo de uso de las funciones
        int[] array = generaArrayInt(10, 1, 100);
        System.out.println("Array generado: " + Arrays.toString(array));
        System.out.println("Mínimo del array: " + minimoArrayInt(array));
        System.out.println("Máximo del array: " + maximoArrayInt(array));
        System.out.println("Media del array: " + mediaArrayInt(array));
        int numeroBuscar = 42;
        System.out.println("¿El número " + numeroBuscar + " está en el array? " + estaEnArrayInt(array, numeroBuscar));
        System.out.println("Posición del número " + numeroBuscar + ": " + posicionEnArray(array, numeroBuscar));
        System.out.println("Array invertido: " + Arrays.toString(volteaArrayInt(array)));

        int[] arrayRotadoDerecha = rotaDerechaArrayInt(array, 3);
        System.out.println("Array rotado a la derecha: " + Arrays.toString(arrayRotadoDerecha));

        int[] arrayRotadoIzquierda = rotaIzquierdaArrayInt(array, 2);
        System.out.println("Array rotado a la izquierda: " + Arrays.toString(arrayRotadoIzquierda));
    }

    public static int[] generaArrayInt(int tamaño, int minimo, int maximo) {
        int[] array = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }
        return array;
    }

    public static int minimoArrayInt(int[] array) {
        int minimo = array[0];
        for (int num : array) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    public static int maximoArrayInt(int[] array) {
        int maximo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public static double mediaArrayInt(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }

    public static boolean estaEnArrayInt(int[] array, int numero) {
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static int[] volteaArrayInt(int[] array) {
        int[] arrayVolteado = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            arrayVolteado[i] = array[j];
        }
        return arrayVolteado;
    }

    public static int[] rotaDerechaArrayInt(int[] array, int posiciones) {
        int[] arrayRotado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRotado[(i + posiciones) % array.length] = array[i];
        }
        return arrayRotado;
    }

    public static int[] rotaIzquierdaArrayInt(int[] array, int posiciones) {
        int[] arrayRotado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRotado[i] = array[(i + posiciones) % array.length];
        }
        return arrayRotado;
    }
}
