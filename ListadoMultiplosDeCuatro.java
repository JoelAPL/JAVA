public class ListadoMultiplosDeCuatro {
    public static void main(String[] args) {
        System.out.println("Listado de Múltiplos de 4 desde el 22 hasta el 2235:");

        int limiteSuperior = 2235;
        int numero = 22;

        while (numero <= limiteSuperior) {
            // Verifica si el número actual es un múltiplo de 4
            if (numero % 4 == 0) {
                // Imprime el número solo si es un múltiplo de 4
                System.out.print(numero + " ");
            }

            // Avanza al siguiente número
            numero++;

            // Imprime un salto de línea después de cada 4 números
            if ((numero - 22) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
