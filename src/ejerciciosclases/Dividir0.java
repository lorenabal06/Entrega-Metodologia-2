package Ejercicio5;

public class Dividir0 {
    public static void main(String[] args) {
        try {
            // Da error por dividir entre 0
            int resultado = 10 / 0;
            /* Esto lanza una excepción porque no se puede dividir entre 0.
            No existe número que al dividirlo entre 0 de un valor,
            incluso el propio 0 al dividirlo entre 0 no da 1, sino error o indeterminación (tipo de error)
            */
        }

        catch (ArithmeticException e) {  // Esta salida indica el tipo de error
            System.out.println("Error: No se puede dividir entre cero.");
        }
        // Gracias al try-catch el programa sigue a pesar el error para ver si hay más errores
        System.out.println("El programa continúa después del catch.");
    }
}
