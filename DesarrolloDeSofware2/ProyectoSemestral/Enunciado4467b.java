package ProyectoSemestral;

public class Enunciado4467b {

    public static void main(String[] args) {
        // Declaración e inicialización de la tabla MiTabla
        int[][] miTabla = new int[5][5];

        // Llenar las celdas de la tabla con valores enteros aleatorios no mayores de 100
        llenarTabla(miTabla);

        // Imprimir la tabla MiTabla
        System.out.println("Tabla MiTabla:");
        imprimirTabla(miTabla);

        // Calcular la sumatoria y el promedio global de los contenidos de la tabla MiTabla
        int sumatoria = calcularSumatoria(miTabla);
        double promedio = calcularPromedio(miTabla);
        System.out.println("\nSumatoria: " + sumatoria);
        System.out.println("Promedio: " + promedio);

        // Imprimir el contenido de las celdas que conforman la diagonal principal de la tabla MiTabla
        System.out.println("\nContenido de la diagonal principal:");
        imprimirDiagonalPrincipal(miTabla);

        // Determinar cuáles y cuántas celdas dentro de la matriz MiTabla tienen valores pares
        int cantidadPares = contarPares(miTabla);
        System.out.println("\nCantidad de celdas con valores pares: " + cantidadPares);
    }

    // Método para llenar las celdas de la tabla con valores enteros aleatorios no mayores de 100
    private static void llenarTabla(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * 101);
            }
        }
    }

    // Método para imprimir la tabla
    private static void imprimirTabla(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para calcular la sumatoria de los contenidos de la tabla
    private static int calcularSumatoria(int[][] tabla) {
        int sumatoria = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                sumatoria += tabla[i][j];
            }
        }
        return sumatoria;
    }

    // Método para calcular el promedio de los contenidos de la tabla
    private static double calcularPromedio(int[][] tabla) {
        int totalElementos = tabla.length * tabla[0].length;
        int sumatoria = calcularSumatoria(tabla);
        return (double) sumatoria / totalElementos;
    }

    // Método para imprimir el contenido de las celdas que conforman la diagonal principal
    private static void imprimirDiagonalPrincipal(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i][i] + "\t");
        }
        System.out.println();
    }

    // Método para contar cuántas celdas dentro de la matriz tienen valores pares
    private static int contarPares(int[][] tabla) {
        int cantidadPares = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] % 2 == 0) {
                    cantidadPares++;
                }
            }
        }
        return cantidadPares;
    }
}

