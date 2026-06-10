package lab7;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int paloAleatorio = (int) (Math.random() * 4);
        int cartaAleatoria = (int) (Math.random() * 13);

        String cartaElegida = cartas[cartaAleatoria] + " de " + palos[paloAleatorio];
        System.out.println("Carta al azar: " + cartaElegida);
    }
}
