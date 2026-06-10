package lab7;

public class Ejercicio12 {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            System.out.print((char) ((int) (Math.random() * 95) + 32) + " ");
        }
    }
}
