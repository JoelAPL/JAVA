package lab7;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] notas = new int[20];
        int suspensos = 0, suficientes = 0, bienes = 0, notables = 0, sobresalientes = 0;

        System.out.println("Notas generadas al azar:");

        for (int i = 0; i < 20; i++) {
            int nota = (int) (Math.random() * 5) + 1;
            notas[i] = nota;

            switch (nota) {
                case 1:
                    System.out.println("Suspenso");
                    suspensos++;
                    break;
                case 2:
                    System.out.println("Suficiente");
                    suficientes++;
                    break;
                case 3:
                    System.out.println("Bien");
                    bienes++;
                    break;
                case 4:
                    System.out.println("Notable");
                    notables++;
                    break;
                case 5:
                    System.out.println("Sobresaliente");
                    sobresalientes++;
                    break;
            }
        }

        System.out.println("\nNúmero de suspensos: " + suspensos);
        System.out.println("Número de suficientes: " + suficientes);
        System.out.println("Número de bienes: " + bienes);
        System.out.println("Número de notables: " + notables);
        System.out.println("Número de sobresalientes: " + sobresalientes);
    }
}
