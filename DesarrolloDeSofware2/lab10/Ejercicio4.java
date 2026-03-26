package lab10;
import java.util.ArrayList;
import java.util.List;

// Clase Equipo
public class Equipo {
    private String nombre;
    private String ciudad;
    private List<Jugador> jugadores = new ArrayList<>();
    private Entrenador entrenador;
    // Otros atributos y métodos según sea necesario

    // Constructor
    public Equipo(String nombre, String ciudad, Entrenador entrenador) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.entrenador = entrenador;
    }

    // Métodos para agregar jugadores, registrar resultado de un partido, obtener estadísticas del equipo, etc.
}

// Clase Jugador
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;
    private Equipo equipoActual;
    private List<Equipo> historialEquipos = new ArrayList<>();
    // Otros atributos y métodos según sea necesario

    // Constructor
    public Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    // Métodos para calcular estadísticas, cambiar de equipo, participar en un partido, etc.
}

// Clase Entrenador
public class Entrenador {
    private String nombre;
    private int edad;
    private List<Equipo> historialEquipos = new ArrayList<>();
    // Otros atributos y métodos según sea necesario

    // Constructor
    public Entrenador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para planificar estrategias, dirigir entrenamientos, tomar decisiones tácticas durante un partido, etc.
}

// Clase Partido
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String fecha;
    private String lugar;
    private int resultadoEquipoLocal;
    private int resultadoEquipoVisitante;
    // Otros atributos y métodos según sea necesario

    // Métodos para registrar resultado, generar estadísticas del partido, determinar ganador, etc.
}

// Clase Liga
public class Liga {
    private List<Equipo> equiposParticipantes = new ArrayList<>();
    private List<Partido> calendarioPartidos = new ArrayList<>();
    // Otros atributos y métodos según sea necesario

    // Métodos para programar partidos, calcular clasificación, gestionar reglas de la liga, etc.
}
