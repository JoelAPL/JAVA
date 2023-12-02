package lab7;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey", "As"};

        int paloAleatorio = (int) (Math.random() * 4);
        int cartaAleatoria = (int) (Math.random() * 10);

        String cartaElegida = cartas[cartaAleatoria] + " de " + palos[paloAleatorio];
        System.out.println("Carta al azar: " + cartaElegida);
    }
}
