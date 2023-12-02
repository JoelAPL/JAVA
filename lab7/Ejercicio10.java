package lab7;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Dibujando diez líneas aleatorias:");

        for (int i = 0; i < 10; i++) {
            int longitud = (int) (Math.random() * 40) + 1;
            char caracter = obtenerCaracterAleatorio();
            for (int j = 0; j < longitud; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    private static char obtenerCaracterAleatorio() {
        char[] caracteres = {'*', '-', '=', '.', '|', '@'};
        int indice = (int) (Math.random() * caracteres.length);
        return caracteres[indice];
    }
}
