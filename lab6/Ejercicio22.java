package lab6;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 100 (ambos incluidos):");

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}

