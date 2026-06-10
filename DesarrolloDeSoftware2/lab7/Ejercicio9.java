package lab7;

public class Ejercicio9 {
    public static void main(String[] args) {
        int contador = 0;

        while (true) {
            int numero = (int) (Math.random() * 101);
            System.out.print(numero + " ");
            contador++;

            if (numero == 24) {
                break;
            }
        }

        System.out.println("\nSe generaron " + contador + " números hasta obtener el 24.");
    }
}

