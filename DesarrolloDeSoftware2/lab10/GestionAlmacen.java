package lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlmacen {
    private static ArrayList<Articulo> almacen = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú GESTISIMAL");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listarArticulos();
                    break;
                case 2:
                    darAltaArticulo();
                    break;
                case 3:
                    darBajaArticulo();
                    break;
                case 4:
                    modificarArticulo();
                    break;
                case 5:
                    entradaMercancia();
                    break;
                case 6:
                    salidaMercancia();
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 7);
    }

    public static void listarArticulos() {
        if (!almacen.isEmpty()) {
            System.out.println("\nListado de Artículos:");
            for (Articulo articulo : almacen) {
                System.out.println(articulo);
            }
        } else {
            System.out.println("El almacén está vacío.");
        }
    }

    public static void darAltaArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código del artículo: ");
        int codigo = scanner.nextInt();

        if (!existeArticulo(codigo)) {
            scanner.nextLine(); // Limpiar el buffer de la línea anterior
            System.out.print("Descripción del artículo: ");
            String descripcion = scanner.nextLine();
            System.out.print("Precio de compra: ");
            double precioCompra = scanner.nextDouble();
            System.out.print("Precio de venta: ");
            double precioVenta = scanner.nextDouble();
            System.out.print("Stock inicial: ");
            int stock = scanner.nextInt();

            Articulo nuevoArticulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
            almacen.add(nuevoArticulo);
            System.out.println("Artículo dado de alta correctamente.");
        } else {
            System.out.println("Error: El código del artículo ya existe. Introduce un código único.");
        }
    }

    public static void darBajaArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del artículo a dar de baja: ");
        int codigo = scanner.nextInt();

        int indice = buscarArticuloPorCodigo(codigo);
        if (indice != -1) {
            almacen.remove(indice);
            System.out.println("Artículo dado de baja correctamente.");
        } else {
            System.out.println("Error: El código introducido no existe.");
        }
    }

    public static void modificarArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del artículo a modificar: ");
        int codigo = scanner.nextInt();

        int indice = buscarArticuloPorCodigo(codigo);
        if (indice != -1) {
            scanner.nextLine(); // Limpiar el buffer de la línea anterior
            System.out.print("Nueva descripción del artículo: ");
            String nuevaDescripcion = scanner.nextLine();
            System.out.print("Nuevo precio de compra: ");
            double nuevoPrecioCompra = scanner.nextDouble();
            System.out.print("Nuevo precio de venta: ");
            double nuevoPrecioVenta = scanner.nextDouble();
            System.out.print("Nuevo stock: ");
            int nuevoStock = scanner.nextInt();

            Articulo articuloModificado = new Articulo(codigo, nuevaDescripcion, nuevoPrecioCompra, nuevoPrecioVenta, nuevoStock);
            almacen.set(indice, articuloModificado);
            System.out.println("Artículo modificado correctamente.");
        } else {
            System.out.println("Error: El código introducido no existe.");
        }
    }

    public static void entradaMercancia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del artículo: ");
        int codigo = scanner.nextInt();

        int indice = buscarArticuloPorCodigo(codigo);
        if (indice != -1) {
            System.out.print("Cantidad de mercancía a añadir: ");
            int cantidad = scanner.nextInt();

            Articulo articulo = almacen.get(indice);
            articulo.incrementarStock(cantidad);
            System.out.println("Entrada de mercancía realizada correctamente.");
        } else {
            System.out.println("Error: El código introducido no existe.");
        }
    }

    public static void salidaMercancia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del artículo: ");
        int codigo = scanner.nextInt();

        int indice = buscarArticuloPorCodigo(codigo);
        if (indice != -1) {
            Articulo articulo = almacen.get(indice);

            System.out.print("Cantidad de mercancía a vender: ");
            int cantidad = scanner.nextInt();

            if (articulo.getStock() >= cantidad) {
                articulo.decrementarStock(cantidad);
                System.out.println("Salida de mercancía realizada correctamente.");
            } else {
                System.out.println("Error: No hay suficiente stock para realizar la venta.");
            }
        } else {
            System.out.println("Error: El código introducido no existe.");
        }
    }

    public static boolean existeArticulo(int codigo) {
        for (Articulo articulo : almacen) {
            if (articulo.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public static int buscarArticuloPorCodigo(int codigo) {
        for (int i = 0; i < almacen.size(); i++) {
            if (almacen.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
}

class Articulo {
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void incrementarStock(int cantidad) {
        stock += cantidad;
    }

    public void decrementarStock(int cantidad) {
        stock -= cantidad;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion +
               ", Precio de compra: " + precioCompra + ", Precio de venta: " + precioVenta +
               ", Stock: " + stock;
    }
}
