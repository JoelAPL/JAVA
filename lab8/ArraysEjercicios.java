package lab8;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEjercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Ejercicio 1
        int[] num = {39, -2, 0, 0, 0, 14, 0, -5, 120, 11, 7, 23};
        mostrarArray("Ejercicio 1 - Array num:", num);

        // Ejercicio 2
        char[] simbolo = {'a', ' ', ' ', '3', '$', ' ', '+', '*', '#', 'Z'};
        mostrarArray("Ejercicio 2 - Array simbolo:", simbolo);

        // Ejercicio 3
        int[] numerosInvertidos = leerYInvertirArray(scanner, 10);
        mostrarArray("Ejercicio 3 - Números invertidos:", numerosInvertidos);

        // Ejercicio 4
        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
            cuadrado[i] = numeros[i] * numeros[i];
            cubo[i] = numeros[i] * numeros[i] * numeros[i];
        }

        mostrarArraysEnColumnas("Ejercicio 4 - Numeros, Cuadrados y Cubos:",
                numeros, cuadrado, cubo);

        // Ejercicio 5
        int[] numerosParaMaxMin = leerArray(scanner, 10);
        mostrarConMaximoYMinimo("Ejercicio 5 - Números con Máximo y Mínimo:", numerosParaMaxMin);

        // Ejercicio 6
        int[] arrayRotado = rotarArray(leerArray(scanner, 15));
        mostrarArray("Ejercicio 6 - Array Rotado:", arrayRotado);

        // Ejercicio 7
        int[] numerosAleatorios = generarNumerosAleatorios(100, 0, 20);
        mostrarArray("Ejercicio 7 - Números Aleatorios:", numerosAleatorios);

        System.out.print("Ingresa el valor a cambiar: ");
        int valorAntiguo = scanner.nextInt();
        System.out.print("Ingresa el nuevo valor: ");
        int valorNuevo = scanner.nextInt();

        cambiarValoresArray(numerosAleatorios, valorAntiguo, valorNuevo);
        mostrarArray("Ejercicio 7 - Array Modificado:", numerosAleatorios);

        // Ejercicio 8
        int[] temperaturas = leerArray(scanner, 12);
        mostrarDiagramaDeBarras("Ejercicio 8 - Temperaturas Mensuales:", temperaturas);

        // Ejercicio 9
        int[] numerosParesImpares = leerArray(scanner, 8);
        mostrarParImpar("Ejercicio 9 - Pares e Impares:", numerosParesImpares);

        // Ejercicio 10
        int[] arrayOriginal = generarNumerosAleatorios(20, 0, 100);
        int[] arrayModificado = ordenarParesImpares(arrayOriginal);
        mostrarArray("Ejercicio 10 - Array Modificado:", arrayModificado);

        // Ejercicio 11
        int[] arrayClientes = leerArray(scanner, 10);
        mostrarArrayConIndice("Ejercicio 11 - Array Inicial:", arrayClientes);
        colocarPrimosAlInicio(arrayClientes);
        mostrarArrayConIndice("Ejercicio 11 - Array Final:", arrayClientes);

        // Ejercicio 12
        int[] arrayRotadoPosiciones = rotarPosiciones(leerArray(scanner, 10));
        mostrarArrayConIndice("Ejercicio 12 - Array Inicial:", arrayRotadoPosiciones);

        System.out.print("Ingresa la posición inicial: ");
        int posicionInicial = scanner.nextInt();
        System.out.print("Ingresa la posición final: ");
        int posicionFinal = scanner.nextInt();

        if (posicionInicial < posicionFinal && posicionInicial >= 0 && posicionFinal <= 9) {
            rotarPosiciones(arrayRotadoPosiciones, posicionInicial, posicionFinal);
            mostrarArrayConIndice("Ejercicio 12 - Array Final:", arrayRotadoPosiciones);
        } else {
            System.out.println("Error: Las posiciones no son válidas.");
        }

        scanner.close();

        
    }

    // Métodos auxiliares
    private static void mostrarArray(String mensaje, int[] array) {
        System.out.println(mensaje);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    private static void mostrarArray(String mensaje, char[] array) {
        System.out.println(mensaje);
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    private static void mostrarArraysEnColumnas(String mensaje, int[] arr1, int[] arr2, int[] arr3) {
        System.out.println(mensaje);
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%-5d %-5d %-5d%n", arr1[i], arr2[i], arr3[i]);
        }
        System.out.println();
    }

    private static void mostrarConMaximoYMinimo(String mensaje, int[] array) {
        int maximo = array[0];
        int minimo = array[0];

        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
            if (num < minimo) {
                minimo = num;
            }
        }

        System.out.println(mensaje);
        for (int num : array) {
            System.out.printf("%-5d %s%n", num, (num == maximo) ? "máximo" : (num == minimo) ? "mínimo" : "");
        }
        System.out.println();
    }

    private static int[] leerArray(Scanner scanner, int longitud) {
        int[] array = new int[longitud];
        System.out.println("Ingresa " + longitud + " números:");
        for (int i = 0; i < longitud; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int[] leerYInvertirArray(Scanner scanner, int longitud) {
        int[] array = leerArray(scanner, longitud);
        for (int i = 0; i < longitud / 2; i++) {
            int temp = array[i];
            array[i] = array[longitud - 1 - i];
            array[longitud - 1 - i] = temp;
        }
        return array;
    }

    private static int[] rotarArray(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;
    }

    private static int[] generarNumerosAleatorios(int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    private static void cambiarValoresArray(int[] array, int valorAntiguo, int valorNuevo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorAntiguo) {
                array[i] = valorNuevo;
            }
        }
    }

    private static void mostrarDiagramaDeBarras(String mensaje, int[] array) {
        System.out.println(mensaje);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void mostrarParImpar(String mensaje, int[] array) {
        System.out.println(mensaje);
        for (int num : array) {
            System.out.printf("%-5d %s%n", num, (num % 2 == 0) ? "par" : "impar");
        }
        System.out.println();
    }

    private static int[] ordenarParesImpares(int[] array) {
        int[] arrayModificado = new int[array.length];
        int indicePar = 0;
        int indiceImpar = array.length - 1;

        for (int num : array) {
            if (num % 2 == 0) {
                arrayModificado[indicePar++] = num;
            } else {
                arrayModificado[indiceImpar--] = num;
            }
        }

        return arrayModificado;
    }
    // Métodos auxiliares
    private static void mostrarArrayConIndice(String mensaje, int[] array) {
        System.out.println(mensaje);
        System.out.println("┌────────┬────────┐");
        System.out.println("│ Índice │ Valor  │");
        System.out.println("├────────┼────────┤");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("│ %-6d │ %-6d │%n", i, array[i]);
        }
        System.out.println("└────────┴────────┘");
        System.out.println();
    }

    private static void colocarPrimosAlInicio(int[] array) {
        int[] arrayAux = Arrays.copyOf(array, array.length);
        int indicePrimos = 0;

        for (int num : arrayAux) {
            if (esPrimo(num)) {
                array[indicePrimos++] = num;
            }
        }

        for (int num : arrayAux) {
            if (!esPrimo(num)) {
                array[indicePrimos++] = num;
            }
        }
    }

    private static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] rotarPosiciones(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;

    }

    private static void rotarPosiciones(int[] array, int posicionInicial, int posicionFinal) {
        int temp = array[posicionInicial];
        if (posicionInicial < posicionFinal) {
            for (int i = posicionInicial; i < posicionFinal; i++) {
                array[i] = array[i + 1];
            }
            array[posicionFinal] = temp;
        } else if (posicionInicial > posicionFinal) {
            for (int i = posicionInicial; i > posicionFinal; i--) {
                array[i] = array[i - 1];
            }
            array[posicionFinal] = temp;
        }
    }

}