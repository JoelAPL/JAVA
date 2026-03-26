package lab9; 

public class Ejercicio1al14 {

    // 1. esCapicua
    public static boolean esCapicua(int numero) {
        return Integer.toString(numero).equals(new StringBuilder(Integer.toString(numero)).reverse().toString());
    }

    // 2. esPrimo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 3. siguientePrimo
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }

    // 4. potencia
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // 5. digitos
    public static int digitos(int numero) {
        return Integer.toString(numero).length();
    }

    // 6. voltea
    public static int voltea(int numero) {
        return Integer.parseInt(new StringBuilder(Integer.toString(numero)).reverse().toString());
    }

    // 7. digitoN
    public static int digitoN(int numero, int posicion) {
        String numStr = Integer.toString(numero);
        if (posicion >= 0 && posicion < numStr.length()) {
            return Character.getNumericValue(numStr.charAt(posicion));
        } else {
            return -1; // Fuera de rango
        }
    }

    // 8. posicionDeDigito
    public static int posicionDeDigito(int numero, int digito) {
        String numStr = Integer.toString(numero);
        int longitud = numStr.length();
        for (int i = 0; i < longitud; i++) {
            if (Character.getNumericValue(numStr.charAt(i)) == digito) {
                return i;
            }
        }
        return -1; // Dígito no encontrado
    }

    // 9. quitaPorDetras
    public static int quitaPorDetras(int numero, int n) {
        return numero / (int) Math.pow(10, n);
    }

    // 10. quitaPorDelante
    public static int quitaPorDelante(int numero, int n) {
        String numStr = Integer.toString(numero);
        int longitud = numStr.length();
        if (n < longitud) {
            return Integer.parseInt(numStr.substring(n));
        } else {
            return 0; // Si n es mayor o igual a la longitud, el resultado es 0
        }
    }

    // 11. pegaPorDetras
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    // 12. pegaPorDelante
    public static int pegaPorDelante(int numero, int digito) {
        return Integer.parseInt(digito + Integer.toString(numero));
    }

    // 13. trozoDeNumero
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numStr = Integer.toString(numero);
        int longitud = numStr.length();
        if (inicio >= 0 && inicio <= fin && fin < longitud) {
            return Integer.parseInt(numStr.substring(inicio, fin + 1));
        } else {
            return -1; // Índices no válidos
        }
    }

    // 14. juntaNumeros
    public static int juntaNumeros(int numero1, int numero2) {
        return Integer.parseInt(Integer.toString(numero1) + Integer.toString(numero2));
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        int num1 = 12345;
        int num2 = 678;
        System.out.println("Es capicúa: " + esCapicua(num1));
        System.out.println("Es primo: " + esPrimo(num1));
        System.out.println("Siguiente primo: " + siguientePrimo(num1));
        System.out.println("Potencia: " + potencia(2.0, 3));
        System.out.println("Número de dígitos: " + digitos(num1));
        System.out.println("Número volteado: " + voltea(num1));
        System.out.println("Dígito en posición 2: " + digitoN(num1, 2));
        System.out.println("Posición del dígito 5: " + posicionDeDigito(num1, 5));
        System.out.println("Quitando 2 dígitos por detrás: " + quitaPorDetras(num1, 2));
        System.out.println("Quitando 2 dígitos por delante: " + quitaPorDelante(num1, 2));
        System.out.println("Añadiendo el dígito 9 por detrás: " + pegaPorDetras(num1, 9));
        System.out.println("Añadiendo el dígito 9 por delante: " + pegaPorDelante(num1, 9));
        System.out.println("Tomando el trozo entre las posiciones 1 y 3: " + trozoDeNumero(num1, 1, 3));
        System.out.println("Uniendo los números " + num1 + " y " + num2 + ": " + juntaNumeros(num1, num2));
    }
}
