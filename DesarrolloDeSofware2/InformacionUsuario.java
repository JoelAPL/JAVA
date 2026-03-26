import java.util.Scanner;

public class InformacionUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pregunta 1
        System.out.println("¿Cuál es su nombre?");
        String nombre = scanner.nextLine();

        // Pregunta 2
        System.out.println("¿Qué dispositivo va a utilizar para programar? (PC, portátil, Tablet, celular)");
        String dispositivo = scanner.nextLine();

        // Pregunta 3
        System.out.println("¿Cuál es el sistema operativo de ese equipo?");
        String sistemaOperativo = scanner.nextLine();

        // Pregunta 4
        System.out.println("¿Cuál es la versión JDK de Java instalada en su equipo?");
        String versionJDK = scanner.nextLine();

        // Mostrar respuestas
        System.out.println("\nResumen de respuestas:");
        System.out.println("1) Nombre: " + nombre);
        System.out.println("2) Dispositivo: " + dispositivo);
        System.out.println("3) Sistema Operativo: " + sistemaOperativo);
        System.out.println("4) Versión JDK: " + versionJDK);

        // Cerrar el scanner
        scanner.close();
    }
}
