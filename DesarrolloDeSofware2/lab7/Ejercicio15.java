package lab7;

public class Ejercicio15 {
    public static void main(String[] args) {
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};
        int longitudMelodia = (int) (Math.random() * 7) * 4 + 4;

        System.out.println("Generador de melodía:");

        for (int i = 1; i <= longitudMelodia; i++) {
            System.out.print(notas[(int) (Math.random() * 7)] + " ");

            if (i % 4 == 0) {
                System.out.print("| ");
            }

            if (i == longitudMelodia) {
                System.out.print("||");
            }
        }
    }
}
