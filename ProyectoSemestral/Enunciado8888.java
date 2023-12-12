package ProyectoSemestral;

public class Enunciado8888 {

    public static void main(String[] args) {
        System.out.println("Números en formato natural y sus múltiplos");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s%-15s%-15s%n", "Números Impares", "Múltiplos de 3", "Múltiplos de 7");
        System.out.println("-----------------------------------------");

        // Imprimir listado de números impares, múltiplos de 3 y múltiplos de 7
        imprimirNumerosMultiplos();
    }

    private static void imprimirNumerosMultiplos() {
        int limiteNumerosImpares = 256;
        int limiteMultiplos3 = 339;
        int limiteMultiplos7 = 476;

        for (int i = 1, j = 6, k = 7; i <= limiteNumerosImpares || j <= limiteMultiplos3 || k <= limiteMultiplos7; i += 2, j += 3, k += 7) {
            System.out.printf("%-15s%-15s%-15s%n", (i <= limiteNumerosImpares) ? i : "", (j <= limiteMultiplos3) ? j : "", (k <= limiteMultiplos7) ? k : "");
        }
    }
}
