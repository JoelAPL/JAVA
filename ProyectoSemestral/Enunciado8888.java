package ProyectoSemestral;

public class Enunciado8888 {

    public static void main(String[] args) {
        System.out.println("Los números en formato natural y sus múltiplos");
        System.out.println("--------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%n", "Números Impares", "Múltiplos de 3", "Múltiplos de 7");
        System.out.println("--------------------------------------------");

        // Imprimir listado de números impares entre 1 y 256
        imprimirNumerosImpares();

        // Imprimir listado de múltiplos de 3 entre 6 y 339
        imprimirMultiplosDe3();

        // Imprimir listado de múltiplos de 7 menores de 477
        imprimirMultiplosDe7();
    }

    private static void imprimirNumerosImpares() {
        for (int i = 1; i <= 256; i += 2) {
            System.out.printf("%-15d", i);
        }
        System.out.println();
    }

    private static void imprimirMultiplosDe3() {
        for (int i = 6; i <= 339; i += 3) {
            System.out.printf("%-15d", i);
        }
        System.out.println();
    }

    private static void imprimirMultiplosDe7() {
        for (int i = 7; i < 477; i += 7) {
            System.out.printf("%-15d", i);
        }
        System.out.println();
    }
}
