package lab7;

public class Ejercicio13 {
    public static void main(String[] args) {
        int dado1, dado2;

        do {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;

            System.out.println("Dado 1: " + dado1 + " | Dado 2: " + dado2);

        } while (dado1 != dado2);

        System.out.println("¡Los dos dados tienen el mismo valor!");
    }
}

