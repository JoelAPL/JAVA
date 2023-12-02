package lab7;

public class Ejercicio1 {
    public static void main(String[] args) {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int dado3 = (int) (Math.random() * 6) + 1;

        System.out.println("Tirada de tres dados:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);

        int sumaTotal = dado1 + dado2 + dado3;
        System.out.println("Suma total: " + sumaTotal);
    }
}
