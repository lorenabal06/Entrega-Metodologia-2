package ejerciciosclases;

public class NumberFormatExceptionPrueba {

    public static void main(String[] args) {
        // Array de cadenas para probar la conversión a enteros
        String[] testStrings = { "123", "45a", "789", "abc", "10", "-55", "12.34" };

        // Intentar convertir las cadenas a enteros
        for (String str : testStrings) {
            try {
                // Intentar convertir la cadena a entero
                int number = Integer.parseInt(str);
                System.out.println("La cadena \"" + str + "\" se ha convertido a: " + number);
            } catch (NumberFormatException e) {
                // Si ocurre un error, capturamos la excepción
                System.err.println("❌ La cadena \"" + str + "\" no es un número válido:" + e.getMessage());
            }
        }
    }
}

