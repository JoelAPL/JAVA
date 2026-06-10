package lab7;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Quiniela con probabilidades:");

        for (int i = 1; i <= 15; i++) {
            System.out.print("Partido " + i + ": ");
            int resultado = obtenerResultadoConProbabilidad();
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

    private static int obtenerResultadoConProbabilidad() {
        int aleatorio = (int) (Math.random() * 6);
        if (aleatorio < 3) {
            return 0; // 1
        } else if (aleatorio < 5) {
            return 1; // X
        } else {
            return 2; // 2
        }
    }
}

