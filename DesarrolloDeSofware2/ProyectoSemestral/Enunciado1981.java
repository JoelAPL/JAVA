package ProyectoSemestral;
import java.util.Scanner;

public class Enunciado1981 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        try {
            int edad = scanner.nextInt();

            // Calcular el total en días que ha vivido la persona
            int diasVividos = calcularDiasVividos(edad);
            System.out.println("Total en días vividos: " + diasVividos);

            // Responder a las preguntas adicionales
            responderPreguntas(edad, diasVividos);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, ingresa un valor entero válido para la edad.");
        } finally {
            scanner.close();
        }
    }

    private static int calcularDiasVividos(int edad) {
        // En occidente, asumimos que un año tiene 365 días
        return edad * 365;
    }

    private static void responderPreguntas(int edad, int diasVividos) {
        // Calcular años bisiestos aproximados
        int anosBisiestos = calcularAnosBisiestos(edad);
        System.out.println("Años bisiestos aproximados vividos: " + anosBisiestos);

        // Calcular horas vividas
        long horasVividas = calcularHorasVividas(diasVividos);
        System.out.println("Horas vividas: " + horasVividas);

        // Calcular minutos vividos
        long minutosVividos = calcularMinutosVividos(horasVividas);
        System.out.println("Minutos vividos: " + minutosVividos);
    }

    private static int calcularAnosBisiestos(int edad) {
        // Asumimos que hay un año bisiesto aproximadamente cada 4 años
        return edad / 4;
    }

    private static long calcularHorasVividas(int diasVividos) {
        // Asumimos que un día tiene 24 horas
        return (long) diasVividos * 24;
    }

    private static long calcularMinutosVividos(long horasVividas) {
        // Asumimos que una hora tiene 60 minutos
        return horasVividas * 60;
    }
}