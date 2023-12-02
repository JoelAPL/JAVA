// Ejercicio 1: Clase Caballo
public class Caballo {
    private String nombre;
    private int edad;

    public Caballo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void relinchar() {
        System.out.println("¡Relincho!");
    }

    public void correr() {
        System.out.println("El caballo está corriendo.");
    }

    public void comer() {
        System.out.println("El caballo está comiendo.");
    }
}

// Prueba de la clase Caballo
public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo miCaballo = new Caballo("Caballito", 5);
        miCaballo.relinchar();
        miCaballo.correr();
        miCaballo.comer();
    }
}

// Ejercicio 2: Clases Vehiculo, Bicicleta y Coche
public class Vehiculo {
    private static int vehiculosCreados = 0;
    private static double kilometrosTotales = 0;
    protected double kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
        this.kilometrosRecorridos = 0;
    }

    public void andar(double distancia) {
        this.kilometrosRecorridos += distancia;
        kilometrosTotales += distancia;
        System.out.println("El vehículo ha recorrido " + distancia + " km.");
    }

    public static void verKilometrajeTotal() {
        System.out.println("Kilómetros totales recorridos por todos los vehículos: " + kilometrosTotales + " km.");
    }
}

public class Bicicleta extends Vehiculo {
    public void hacerCaballito() {
        System.out.println("La bicicleta está haciendo el caballito.");
    }

    public void verKilometraje() {
        System.out.println("Kilómetros recorridos por la bicicleta: " + this.kilometrosRecorridos + " km.");
    }
}

public class Coche extends Vehiculo {
    public void quemarRueda() {
        System.out.println("El coche está quemando rueda.");
    }

    public void verKilometraje() {
        System.out.println("Kilómetros recorridos por el coche: " + this.kilometrosRecorridos + " km.");
    }
}

// Prueba de las clases Vehiculo, Bicicleta y Coche
import java.util.Scanner;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        int opcion;
        do {
            // ... (mismo menú de opciones)

        } while (opcion != 8);

        scanner.close();
    }
}

// Ejercicio 3: Clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto
// ... (código de las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto)

// Prueba de las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto
public class PruebaAnimales {
    public static void main(String[] args) {
        // ... (prueba de las instancias y métodos)
    }
}

// Ejercicio 4: Clase Fracción
public class Fraccion {
    private int numerador;
    private int denominador;

    // ... (resto de la implementación de la clase Fracción)
}

// Prueba de la clase Fracción
public class PruebaFraccion {
    public static void main(String[] args) {
        // ... (prueba de las instancias y métodos)
    }
}
