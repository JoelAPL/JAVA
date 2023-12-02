package lab6;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduzca la primera hora.");
        System.out.print("Día: ");
        String dia1 = scanner.nextLine();
        System.out.print("Hora: ");
        int hora1 = scanner.nextInt();

        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.print("Día: ");
        scanner.nextLine(); // Consumir la nueva línea pendiente
        String dia2 = scanner.nextLine();
        System.out.print("Hora: ");
        int hora2 = scanner.nextInt();

        int horasTranscurridas = calcularHorasTranscurridas(dia1, hora1, dia2, hora2);

        System.out.println("Entre las " + hora1 + ":00h del " + dia1 +
                " y las " + hora2 + ":00h del " + dia2 + " hay " +
                horasTranscurridas + " hora/s.");

        scanner.close();
    }

    private static int calcularHorasTranscurridas(String dia1, int hora1, String dia2, int hora2) {
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        int indiceDia1 = -1, indiceDia2 = -1;

        for (int i = 0; i < diasSemana.length; i++) {
            if (dia1.equalsIgnoreCase(diasSemana[i])) {
                indiceDia1 = i;
            }
            if (dia2.equalsIgnoreCase(diasSemana[i])) {
                indiceDia2 = i;
            }
        }

        if (indiceDia1 == -1 || indiceDia2 == -1 || indiceDia2 <= indiceDia1) {
            System.out.println("Error en los datos ingresados.");
            System.exit(1);
        }

        int horasTranscurridas = (indiceDia2 - indiceDia1 - 1) * 24; // horas completas de días intermedios
        horasTranscurridas += (24 - hora1) + hora2; // horas de los días de inicio y fin

        return horasTranscurridas;
    }
}
