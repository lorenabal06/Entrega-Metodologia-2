package Ejercicio5;

import java.util.Scanner;

public class Dividir0usandoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner sirve para que la máquina interactue con el programador

        try {
            // Solicitar al usuario que ingrese dos números enteros, con decimales da error
            System.out.print("Ingresa el numerador: "); // Introduces numerador entero
            int numerador = scanner.nextInt(); // El numerador introducido es el numerador de la operación

            System.out.print("Ingresa el denominador: "); // Introduces denominador
            int denominador = scanner.nextInt(); // El denominador introducido es el numerador de la operación

            // Intentar realizar la división
            int resultado = numerador / denominador; // Obtenemos el resultado de la división
            System.out.println("El resultado de la división es: " + resultado);
            // Se ejecuta si no hay error, es decir, denominador distinto de 0
        }

        // Se ejecuta si el  denominador es 0, sino lo salta y va al finally directamente
        catch (ArithmeticException e) {
            // Manejar el caso de división por cero
            System.out.println("Error: No se puede dividir entre cero.");
            // Sale esta salida si denominador es 0

        }

        // Este bloque siempre se ejecuta
        finally {
            System.out.println("Operación de división finalizada.");
            scanner.close(); // Cerrar el Scanner para liberar recursos
        }
    }
}
