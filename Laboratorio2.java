// Laboratorio2.java

public class Laboratorio2 {

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("Nombre: Joel Alvarez");

        // Ejercicio 2
        System.out.println("Nombre: Joel");
        System.out.println("Dirección: Panama");
        System.out.println("Teléfono: 6548-2425");

        // Ejercicio 3
        String[][] palabras = {
            {"Hello", "Hola"},
            {"Goodbye", "Adiós"},
            {"Dog", "Perro"},
            {"Cat", "Gato"},
            {"Sun", "Sol"},
            {"Moon", "Luna"},
            {"Water", "Agua"},
            {"Tree", "Árbol"},
            {"Book", "Libro"},
            {"Computer", "Computadora"}
        };

        for (String[] par : palabras) {
            System.out.printf("%-15s %s%n", par[0], par[1]);
        }

        // Ejercicio 4
        System.out.println("Horario de Clase:");
        System.out.println("Lunes    - Asignatura 1");
        System.out.println("Martes   - Asignatura 2");
        System.out.println("Miércoles- Asignatura 3");
        System.out.println("Jueves   - Asignatura 4");
        System.out.println("Viernes  - Asignatura 5");

        // Ejercicio 5 (sin colores en Java estándar)
        System.out.println("Horario de Clase:");
        System.out.println("Lunes    - Asignatura 1");
        System.out.println("Martes   - Asignatura 2");
        System.out.println("Miércoles- Asignatura 3");
        System.out.println("Jueves   - Asignatura 4");
        System.out.println("Viernes  - Asignatura 5");

        // Ejercicio 6
        for (int i = 1; i < 10; i += 2) {
            System.out.println(" ".repeat((9 - i) / 2) + "*".repeat(i));
        }

        // Ejercicio 7
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");

        // Ejercicio 8
        for (int i = 9; i > 0; i -= 2) {
            System.out.println(" ".repeat((9 - i) / 2) + "*".repeat(i));
        }

        // Ejercicio 9
        System.out.println("   /\\_/\\   ");
        System.out.println("  ( o.o )  ");
        System.out.println("   > ^ <   ");
    }
}
