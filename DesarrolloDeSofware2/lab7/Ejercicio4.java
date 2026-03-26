package lab7;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("20 números aleatorios entre 0 y 10:");

        for (int i = 0; i < 20; i++) {
            int numero = (int) (Math.random() * 11);
            System.out.print(numero + " ");
        }
    }
}

