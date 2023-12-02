package lab7;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("50 números aleatorios entre 100 y 199:");
        int suma = 0;
        int maximo = 100;
        int minimo = 199;

        for (int i = 0; i < 50; i++) {
            int numero = (int) (Math.random() * 100) + 100;
            System.out.print(numero + " ");
            suma += numero;

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + (suma / 50.0));
    }
}
