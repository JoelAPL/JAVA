package lab10;

public class Ejercicio10 {
    private static final int MAX_DISCOS = 10;
    private Disco[] discos;
    private int numDiscos;

    public ColeccionDiscos() {
        discos = new Disco[MAX_DISCOS];
        numDiscos = 0;
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú Principal");
            System.out.println("1. Nuevo Disco");
            System.out.println("2. Borrar Disco");
            System.out.println("3. Listado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    nuevoDisco();
                    break;
                case 2:
                    borrarDisco();
                    break;
                case 3:
                    mostrarSubMenuListado();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }

    public void nuevoDisco() {
        if (numDiscos < MAX_DISCOS) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Código del disco: ");
            int codigo = scanner.nextInt();

            if (esCodigoUnico(codigo)) {
                scanner.nextLine(); // Limpiar el buffer de la línea anterior
                System.out.print("Título del disco: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor del disco: ");
                String autor = scanner.nextLine();
                System.out.print("Género del disco: ");
                String genero = scanner.nextLine();
                System.out.print("Duración del disco: ");
                double duracion = scanner.nextDouble();

                discos[numDiscos] = new Disco(codigo, titulo, autor, genero, duracion);
                numDiscos++;
                System.out.println("Disco añadido correctamente.");
            } else {
                System.out.println("Error: El código del disco ya existe. Introduce un código único.");
            }
        } else {
            System.out.println("Error: No se pueden añadir más discos. Elimina algunos discos antes de agregar nuevos.");
        }
    }

    public void borrarDisco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del disco a borrar: ");
        int codigo = scanner.nextInt();

        int indice = buscarDiscoPorCodigo(codigo);
        if (indice != -1) {
            for (int i = indice; i < numDiscos - 1; i++) {
                discos[i] = discos[i + 1];
            }
            numDiscos--;
            System.out.println("Disco borrado correctamente.");
        } else {
            System.out.println("Error: El código introducido no existe.");
        }
    }

    public boolean esCodigoUnico(int codigo) {
        for (int i = 0; i < numDiscos; i++) {
            if (discos[i].getCodigo() == codigo) {
                return false;
            }
        }
        return true;
    }

    public int buscarDiscoPorCodigo(int codigo) {
        for (int i = 0; i < numDiscos; i++) {
            if (discos[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarSubMenuListado() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSubmenú Listado");
            System.out.println("1. Listado Completo");
            System.out.println("2. Listado por Autor");
            System.out.println("3. Listado por Género");
            System.out.println("4. Listado por Duración");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listarDiscos();
                    break;
                case 2:
                    listarDiscosPorAutor();
                    break;
                case 3:
                    listarDiscosPorGenero();
                    break;
                case 4:
                    listarDiscosPorDuracion();
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    public void listarDiscos() {
        if (numDiscos > 0) {
            System.out.println("\nListado Completo de Discos:");
            for (int i = 0; i < numDiscos; i++) {
                System.out.println(discos[i]);
            }
        } else {
            System.out.println("No hay discos en la colección.");
        }
    }

    public void listarDiscosPorAutor() {
        if (numDiscos > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el autor: ");
            String autor = scanner.nextLine();

            System.out.println("\nListado de Discos por Autor (" + autor + "):");
            for (int i = 0; i < numDiscos; i++) {
                if (discos[i].getAutor().equalsIgnoreCase(autor)) {
                    System.out.println(discos[i]);
                }
            }
        } else {
            System.out.println("No hay discos en la colección.");
        }
    }

    public void listarDiscosPorGenero() {
        if (numDiscos > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el género: ");
            String genero = scanner.nextLine();

            System.out.println("\nListado de Discos por Género (" + genero + "):");
            for (int i = 0; i < numDiscos; i++) {
                if (discos[i].getGenero().equalsIgnoreCase(genero)) {
                    System.out.println(discos[i]);
                }
            }
        } else {
            System.out.println("No hay discos en la colección.");
        }
    }

    public void listarDiscosPorDuracion() {
        if (numDiscos > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la duración mínima: ");
            double duracionMinima = scanner.nextDouble();
            System.out.print("Introduce la duración máxima: ");
            double duracionMaxima = scanner.nextDouble();

            System.out.println("\nListado de Discos por Duración (" + duracionMinima + " - " + duracionMaxima + "):");
            for (int i = 0; i < numDiscos; i++) {
                if (discos[i].getDuracion() >= duracionMinima && discos[i].getDuracion() <= duracionMaxima) {
                    System.out.println(discos[i]);
                }
            }
        } else {
            System.out.println("No hay discos en la colección.");
        }
    }

    public static void main(String[] args) {
        ColeccionDiscos coleccionDiscos = new ColeccionDiscos();
        coleccionDiscos.ejecutar();
    }
}

class Disco {
    private int codigo;
    private String titulo;
    private String autor;
    private String genero;
    private double duracion;

    public Disco(int codigo, String titulo, String autor, String genero, double duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Autor: " + autor + ", Género: " + genero + ", Duración: " + duracion + " minutos";
    }
}


