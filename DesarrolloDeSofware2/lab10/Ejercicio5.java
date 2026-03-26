
public class Ejercicio5 {
    private String nombre;
    private int edad;
    private String color;
    private double altura;
    private double peso;
    private String raza;
    private String propietario;
    private String estadoSalud;
    private int nivelAdiestramiento;
    private String historialMedico;

    // Constructor
    public Ejercicio5(String nombre, int edad, String color, double altura, double peso,
                   String raza, String propietario, String estadoSalud, int nivelAdiestramiento,
                   String historialMedico) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.altura = altura;
        this.peso = peso;
        this.raza = raza;
        this.propietario = propietario;
        this.estadoSalud = estadoSalud;
        this.nivelAdiestramiento = nivelAdiestramiento;
        this.historialMedico = historialMedico;
    }

    // Métodos
    public void alimentar() {
        // Implementación de la acción de alimentar al caballo
    }

    public void realizarEjercicio() {
        // Implementación de la acción de hacer que el caballo realice ejercicio
    }

    public void cuidarSalud() {
        // Implementación de la acción de cuidar la salud del caballo
    }

    public void entrenar() {
        // Implementación de la acción de entrenar al caballo
    }

    public void cambiarPropietario(String nuevoPropietario) {
        // Implementación de la acción de cambiar el propietario del caballo
        this.propietario = nuevoPropietario;
    }

    public void mostrarInformacion() {
        // Implementación de la acción de mostrar información detallada sobre el caballo
    }

    public void realizarVeterinario() {
        // Implementación de la acción de llevar al caballo al veterinario
    }

    public void aumentarNivelAdiestramiento() {
        // Implementación de la acción de mejorar el nivel de adiestramiento del caballo
        this.nivelAdiestramiento++;
    }

    public void registrarEventoMedico(String evento) {
        // Implementación de la acción de registrar eventos médicos relevantes
        this.historialMedico += evento + "\n";
    }

    public void descansar() {
        // Implementación de la acción de permitir que el caballo descanse
    }
}
