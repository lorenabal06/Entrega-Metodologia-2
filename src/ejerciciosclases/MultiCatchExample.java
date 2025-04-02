package Ejercicio5;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese numerador: ");
            // Gracias a Scanner, el programador ingresa un numerador entero
            int num = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese denominador: ");
            // Gracias a Scanner, el programador ingresa un denominador entero
            int divisor = Integer.parseInt(scanner.nextLine());

            int resultado = num / divisor; // Calcula división en enteros
            System.out.println("Resultado: " + resultado);
        }
        // Si no se introduce un numero entero con números tenemos este error
        catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Debe ser un número entero.");
        }

        // Si el denominador es 0 tenemos este error
        catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        // Si no hay ningún tipo de error, sale resultado en int
        finally {
            System.out.println("Finalizando operación.");
            scanner.close();
        }
    }
}

