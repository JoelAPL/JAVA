// Clase Vivienda
public class Vivienda {
    private String tipo;
    private int numeroHabitaciones;
    private int numeroBanios;
    private double area;
    private String direccion;
    private String propietario;
    private int annoConstruccion;
    private double precio;
    private String estadoMantenimiento;
    // Puedes agregar más atributos según sea necesario

    // Constructor
    public Vivienda(String tipo, int numeroHabitaciones, int numeroBanios, double area, String direccion,
                    String propietario, int annoConstruccion, double precio, String estadoMantenimiento) {
        this.tipo = tipo;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanios = numeroBanios;
        this.area = area;
        this.direccion = direccion;
        this.propietario = propietario;
        this.annoConstruccion = annoConstruccion;
        this.precio = precio;
        this.estadoMantenimiento = estadoMantenimiento;
    }

    // Getters y Setters
    // ...

    // Otros métodos según sea necesario
    // ...
}

// Subclase Casa
public class Casa extends Vivienda {
    private boolean tieneJardin;

    // Constructor
    public Casa(String tipo, int numeroHabitaciones, int numeroBanios, double area, String direccion,
                String propietario, int annoConstruccion, double precio, String estadoMantenimiento,
                boolean tieneJardin) {
        super(tipo, numeroHabitaciones, numeroBanios, area, direccion, propietario, annoConstruccion, precio, estadoMantenimiento);
        this.tieneJardin = tieneJardin;
    }

    // Getter y Setter específicos de Casa
    // ...
}

// Subclase Apartamento
public class Apartamento extends Vivienda {
    private int numeroPisos;

    // Constructor
    public Apartamento(String tipo, int numeroHabitaciones, int numeroBanios, double area, String direccion,
                      String propietario, int annoConstruccion, double precio, String estadoMantenimiento,
                      int numeroPisos) {
        super(tipo, numeroHabitaciones, numeroBanios, area, direccion, propietario, annoConstruccion, precio, estadoMantenimiento);
        this.numeroPisos = numeroPisos;
    }

    // Getter y Setter específicos de Apartamento
    // ...
}

