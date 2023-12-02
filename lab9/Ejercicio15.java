package lab9;

public class Ejercicio15 {

    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

