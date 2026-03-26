public class Laboratorio1 {
    public static void main(String[] args) {
        // Punto 1: Imprimir nombre y cédula
        System.out.println("Nombre: Joel Alvarez");
        System.out.println("Cédula: 8-1014-1396");

        // Punto 2: Imprimir números del 1 al 3 en líneas separadas
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // Punto 3: Programa con formato específico
        String telefono = "Teléfono";
        String medioComunicacion = "medio de comunicación";
        String mensaje = "El " + telefono + " es un " + medioComunicacion + ". Bell lo sabía.";
        System.out.println(mensaje);
    }
}
