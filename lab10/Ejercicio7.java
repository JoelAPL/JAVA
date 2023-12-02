package lab10;
public import java.util.List;

public class Ventana {
    private String titulo;
    private int ancho;
    private int alto;
    private int posX;
    private int posY;
    private String estado;
    private boolean barraHerramientasVisible;
    private boolean barraMenuVisible;
    private boolean botonCerrarVisible;
    private boolean botonMinimizarVisible;
    private boolean botonMaximizarVisible;
    private String icono;
    private boolean visible;
    private List<Componente> componentesInternos;

    // Constructor y métodos según sea necesario
}

class Componente {
    // Clase para representar los componentes internos de la ventana
}
 {
    
}

// Ejercicio 5 
public class Pizza {
    private String tipo;
    private String tamaño;
    private String estado;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        totalPedidas++;
    }

    public void sirve() {
        if (estado.equals("pedida")) {
            estado = "servida";
            totalServidas++;
        } else {
            System.out.println("Esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    @Override
    public String toString() {
        return "pizza " + tipo + " " + tamaño + ", " + estado;
    }
}

// Programa principal
public class PedidosPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.sirve();

        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}

//Ejercicio 6
public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo suma(Tiempo otroTiempo) {
        int sumHoras = this.horas + otroTiempo.horas;
        int sumMinutos = this.minutos + otroTiempo.minutos;
        int sumSegundos = this.segundos + otroTiempo.segundos;

        if (sumSegundos >= 60) {
            sumMinutos += sumSegundos / 60;
            sumSegundos %= 60;
        }

        if (sumMinutos >= 60) {
            sumHoras += sumMinutos / 60;
            sumMinutos %= 60;
        }

        return new Tiempo(sumHoras, sumMinutos, sumSegundos);
    }

    public Tiempo resta(Tiempo otroTiempo) {
        int restaHoras = this.horas - otroTiempo.horas;
        int restaMinutos = this.minutos - otroTiempo.minutos;
        int restaSegundos = this.segundos - otroTiempo.segundos;

        if (restaSegundos < 0) {
            restaMinutos--;
            restaSegundos += 60;
        }

        if (restaMinutos < 0) {
            restaHoras--;
            restaMinutos += 60;
        }

        return new Tiempo(restaHoras, restaMinutos, restaSegundos);
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}

// Programa de prueba
public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo tiempo1 = new Tiempo(1, 20, 30);
        Tiempo tiempo2 = new Tiempo(0, 30, 40);
        Tiempo tiempo3 = new Tiempo(0, 35, 20);

        Tiempo resultadoSuma = tiempo2.suma(tiempo3);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        Tiempo resultadoResta = tiempo2.resta(tiempo3);
        System.out.println("Resultado de la resta: " + resultadoResta);
    }
}

//Ejercicio 7
public class Zona {
    private int entradasPorVender;

    public Zona(int n) {
        entradasPorVender = n;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
        }

        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
}

// Programa principal
import java.util.Scanner;

public class GestionEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        int opcion;
        do {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción (1-3): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas libres en Sala Principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Entradas libres en Compra-Venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Entradas libres en Zona VIP: " + zonaVip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.print("Para qué zona quieres las entradas (1: Sala Principal, 2: Compra-Venta, 3: Zona VIP): ");
                    int zona = scanner.nextInt();

                    System.out.print("Cuántas entradas quieres: ");
                    int cantidad = scanner.nextInt();

                    switch (zona) {
                        case 1:
                            salaPrincipal.vender(cantidad);
                            break;
                        case 2:
                            compraVenta.vender(cantidad);
                            break;
                        case 3:
                            zonaVip.vender(cantidad);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}
