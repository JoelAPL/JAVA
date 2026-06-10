// Laboratorio3.java

public class Laboratorio3 {

    public static void main(String[] args) {
        // Ejercicio 1
        int x = 144;
        int y = 999;

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("División: " + (x / y));
        System.out.println("Multiplicación: " + (x * y));

        // Ejercicio 2
        String nombre = "Joel Alejandro Alvarez";
        System.out.println(nombre);

        // Ejercicio 3
        String direccion = "Ciudad de Panama";
        String telefono = "80394-17272";

        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);

        // Ejercicio 4
        double eurosConversor = 100;
        double pesetas = eurosConversor * 166.386;
        System.out.println(eurosConversor + " euros equivalen a " + pesetas + " pesetas.");

        // Ejercicio 5
        double pesetasConversor = 1000;
        double euros2 = pesetasConversor / 166.386;
        System.out.println(pesetasConversor + " pesetas equivalen a " + euros2 + " euros.");

        // Ejercicio 6
        double baseImponible = 100;
        double iva = 0.21;
        double totalFactura = baseImponible * (1 + iva);
        System.out.println("Total de la factura: " + totalFactura);
    }
}
