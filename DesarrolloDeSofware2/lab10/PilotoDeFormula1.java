// lab10/PilotoDeFormula1.java
package lab10;  // Agrega esta línea para especificar el paquete

public class PilotoDeFormula1 {
    // Atributos
    private String nombre;
    private int edad;
    private String equipo;
    private int numeroDePiloto;
    private double salario;
    private boolean enActivo;

    // Otros atributos posibles (dependiendo de los requisitos)
    private String nacionalidad;
    private int victorias;
    private int podiums;
    // ...

    // Constructor
    public PilotoDeFormula1(String nombre, int edad, String equipo, int numeroDePiloto, double salario, boolean enActivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.numeroDePiloto = numeroDePiloto;
        this.salario = salario;
        this.enActivo = enActivo;
    }

    // Métodos (getters y setters)
    // ...

    // Método principal para el ejemplo
    public static void main(String[] args) {
        // Crear instancias de la clase PilotoDeFormula1
        PilotoDeFormula1 piloto1 = new PilotoDeFormula1("Lewis Hamilton", 36, "Mercedes", 44, 30000000.0, true);
        PilotoDeFormula1 piloto2 = new PilotoDeFormula1("Max Verstappen", 24, "Red Bull Racing", 33, 15000000.0, true);

        // Acceder a los atributos
        System.out.println("Nombre del piloto 1: " + piloto1.getNombre());
        System.out.println("Equipo del piloto 2: " + piloto2.getEquipo());
        // ...
    }

    // Agregar getters y setters según sea necesario
    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    // Otros getters y setters
    // ...
}
