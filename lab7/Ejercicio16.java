package lab7;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] figuras = {"corazón", "diamante", "herradura", "campana", "limón"};

        System.out.println("¡Bienvenido a la máquina tragaperras!");

        String figura1 = figuras[(int) (Math.random() * 5)];
        String figura2 = figuras[(int) (Math.random() * 5)];
        String figura3 = figuras[(int) (Math.random() * 5)];

        System.out.println("Tirada: " + figura1 + " " + figura2 + " " + figura3);

        if (figura1.equals(figura2) && figura2.equals(figura3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
            System.out.println("Bien, ha recuperado su moneda");
        } else {
            System.out.println("Lo siento, ha perdido");
        }

        scanner.close();
    }
}
