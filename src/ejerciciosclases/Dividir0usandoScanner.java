package ejerciciosclases;
import java.util.Scanner;

public class Dividir0usandoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingresa el denominador: ");
            int denominador = scanner.nextInt();

            if (denominador == 0) {
                throw new ArithmeticException();
            }

            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada no válida. Asegúrate de ingresar números enteros.");
        } finally {
            System.out.println("Operación de división finalizada.");
            scanner.close();
        }
    }
}
