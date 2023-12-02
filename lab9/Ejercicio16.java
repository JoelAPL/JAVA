package lab9;
public class Ejercicio16 {

    public static void main(String[] args) {
        System.out.println("Números capicúa entre 1 y 99999:");
        for (int i = 1; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esCapicua(int numero) {
        return Integer.toString(numero).equals(new StringBuilder(Integer.toString(numero)).reverse().toString());
    }
}

