import java.util.Arrays;
import java.util.Random;

public class LlenadoVector {
    public static void main(String[] args) {
        // 1. Por listas de valores
        int[] aleatoriosPorLista = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51};
        System.out.println("Por listas de valores: " + Arrays.toString(aleatoriosPorLista));

        // 2. Por ciclo o bucle de repeticiones (17 primeros números múltiplos de 9)
        int[] aleatoriosPorBucle = new int[17];
        for (int i = 0, num = 9; i < aleatoriosPorBucle.length; i++, num += 9) {
            aleatoriosPorBucle[i] = num;
        }
        System.out.println("Por ciclo o bucle de repeticiones: " + Arrays.toString(aleatoriosPorBucle));

        // 3. Cargando valores enteros dinámicos o aleatorios
        // a) Math.Random
        int[] aleatoriosMathRandom = new int[17];
        for (int i = 0; i < aleatoriosMathRandom.length; i++) {
            aleatoriosMathRandom[i] = (int) (Math.random() * 100); // Rango de 0 a 99
        }
        System.out.println("Por Math.Random: " + Arrays.toString(aleatoriosMathRandom));

        // b) java.util.Random.nextInt
        Random random = new Random();
        int[] aleatoriosNextInt = new int[17];
        for (int i = 0; i < aleatoriosNextInt.length; i++) {
            aleatoriosNextInt[i] = random.nextInt(100); // Rango de 0 a 99
        }
        System.out.println("Por java.util.Random.nextInt: " + Arrays.toString(aleatoriosNextInt));

        // c) java.util.Random.ints
        int[] aleatoriosInts = random.ints(17, 0, 100).toArray(); // 17 números en el rango de 0 a 99
        System.out.println("Por java.util.Random.ints: " + Arrays.toString(aleatoriosInts));
    }
}
