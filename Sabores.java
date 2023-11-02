public class Sabores {
    // Atributos de la clase
    private String nombreDelSabor;
    private char categoriaDelSabor;
    private float valorDelVaso8oz;

    // Constructor por defecto
    public Sabores() {
        nombreDelSabor = "Rojo";
        categoriaDelSabor = 'A';
        valorDelVaso8oz = 0.75f;
    }

    // Constructor con parámetros
    public Sabores(String sabor, char categoria, float precio) {
        nombreDelSabor = sabor;
        categoriaDelSabor = categoria;
        valorDelVaso8oz = precio;
    }

    // Método para imprimir los detalles del sabor
    public void imprimirDetalleDelSabor() {
        System.out.println("Detalles del Sabor:");
        System.out.println("Nombre del Sabor: " + nombreDelSabor);
        System.out.println("Categoría del Sabor: " + categoriaDelSabor);
        System.out.println("Valor del Vaso de 8 oz: $" + valorDelVaso8oz);
    }

}
