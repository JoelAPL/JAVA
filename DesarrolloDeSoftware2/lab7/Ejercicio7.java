package lab7;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Quiniela:");

        for (int i = 1; i <= 15; i++) {
            System.out.print("Partido " + i + ": ");
            int resultado = (int) (Math.random() * 3);

            switch (resultado) {
                case 0:
                    System.out.println("1");
                    break;
                case 1:
                    System.out.println("X");
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        }
    }
}

