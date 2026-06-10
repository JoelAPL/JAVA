import java.util.Scanner;

public class Laboratorio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ejercicio 1: Multiplicación de dos números");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado de la multiplicación: " + (num1 * num2));

        // Ejercicio 2
        System.out.println("\nEjercicio 2: Conversor de euros a pesetas");
        System.out.print("Introduce la cantidad de euros: ");
        double euros = scanner.nextDouble();
        double pesetasEuros = euros * 166.386;
        System.out.println(euros + " euros equivalen a " + pesetasEuros + " pesetas.");

        // Ejercicio 3
        System.out.println("\nEjercicio 3: Conversor de pesetas a euros");
        System.out.print("Introduce la cantidad de pesetas: ");
        double pesetas = scanner.nextDouble();
        double eurosPesetas = pesetas / 166.386;
        System.out.println(pesetas + " pesetas equivalen a " + eurosPesetas + " euros.");

        // Ejercicio 4
        System.out.println("\nEjercicio 4: Operaciones básicas con dos números");
        System.out.print("Introduce el primer número: ");
        double num3 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num4 = scanner.nextDouble();
        System.out.println("Suma: " + (num3 + num4));
        System.out.println("Resta: " + (num3 - num4));
        System.out.println("Multiplicación: " + (num3 * num4));
        System.out.println("División: " + (num3 / num4));

        // Ejercicio 5
        System.out.println("\nEjercicio 5: Cálculo del área de un rectángulo");
        System.out.print("Introduce la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("El área del rectángulo es: " + areaRectangulo);

        // Ejercicio 6
        System.out.println("\nEjercicio 6: Cálculo del área de un triángulo");
        System.out.print("Introduce la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El área del triángulo es: " + areaTriangulo);

        // Ejercicio 7
        System.out.println("\nEjercicio 7: Cálculo total de una factura");
        System.out.print("Introduce la base imponible: ");
        double baseImponible = scanner.nextDouble();
        System.out.print("Introduce el porcentaje de IVA: ");
        double porcentajeIVA = scanner.nextDouble();
        double iva = baseImponible * (porcentajeIVA / 100);
        double totalFactura = baseImponible + iva;
        System.out.println("Total de la factura: " + totalFactura);

        // Ejercicio 8
        System.out.println("\nEjercicio 8: Cálculo salario semanal de un empleado");
        System.out.print("Introduce las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        double salarioSemanal = horasTrabajadas * 12;
        System.out.println("El salario semanal es: " + salarioSemanal);

        // Ejercicio 9
        System.out.println("\nEjercicio 9: Cálculo del volumen de un cono");
        System.out.print("Introduce el radio del cono: ");
        double radioCono = scanner.nextDouble();
        System.out.print("Introduce la altura del cono: ");
        double alturaCono = scanner.nextDouble();
        double volumenCono = (Math.PI * Math.pow(radioCono, 2) * alturaCono) / 3;
        System.out.println("El volumen del cono es: " + volumenCono);

        // Ejercicio 10
        System.out.println("\nEjercicio 10: Conversor de Mb a Kb");
        System.out.print("Introduce la cantidad en Mb: ");
        double mb = scanner.nextDouble();
        double kb = mb * 1024;
        System.out.println(mb + " Mb equivalen a " + kb + " Kb.");

        // Ejercicio 11
        System.out.println("\nEjercicio 11: Conversor de Kb a Mb");
        System.out.print("Introduce la cantidad en Kb: ");
        double kb2 = scanner.nextDouble();
        double mb2 = kb2 / 1024;
        System.out.println(kb2 + " Kb equivalen a " + mb2 + " Mb.");

        // Ejercicio 12
        System.out.println("\nEjercicio 12: Cálculo del precio final de un producto");
        System.out.print("Introduce la base imponible: ");
        double baseImponible2 = scanner.nextDouble();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.print("Introduce el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = scanner.nextLine();
        double porcentajeIVA2;
        switch (tipoIVA.toLowerCase()) {
            case "general":
                porcentajeIVA2 = 21;
                break;
            case "reducido":
                porcentajeIVA2 = 10;
                break;
            case "superreducido":
                porcentajeIVA2 = 4;
                break;
            default:
                porcentajeIVA2 = 0;
        }
        double iva2 = baseImponible2 * (porcentajeIVA2 / 100);

        System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.nextLine();
        double descuento = 0;
        switch (codigoPromocional.toLowerCase()) {
            case "nopro":
                descuento = 0;
                break;
            case "mitad":
                descuento = baseImponible2 / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = baseImponible2 * 0.05;
                break;
        }

        double total2 = baseImponible2 + iva2 - descuento;

        System.out.println("Base imponible: " + baseImponible2);
        System.out.println("IVA (" + porcentajeIVA2 + "%): " + iva2);
        System.out.println("Precio con IVA: " + (baseImponible2 + iva2));
        System.out.println("Cód. promo. (" + codigoPromocional + "): -" + descuento);
        System.out.println("TOTAL: " + total2);

        // Ejercicio 13
        System.out.println("\nEjercicio 13: Cálculo de nota necesaria en segundo examen");
        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();
        double notaNecesaria = (notaDeseada - 0.4 * notaPrimerExamen) / 0.6;
        System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaNecesaria + " en el segundo examen.");

        scanner.close();
    }
}
