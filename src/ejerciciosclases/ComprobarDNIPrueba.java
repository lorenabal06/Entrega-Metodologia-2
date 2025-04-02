package ejerciciosclases;

public class ComprobarDNIPrueba {
    // Letras que corresponden al resto de dividir el número entre 23
    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static boolean isValidDNI(String dni) throws ComprobarDNIException {
        // Comprobar que la longitud es correcta y que tiene el formato adecuado
        if (!dni.matches("\\d{8}[A-Z]")) {
            throw new ComprobarDNIException("El formato del DNI no es válido (debe ser 8 números y una letra mayúscula).");
        }

        // Extraer número y letra
        int number = Integer.parseInt(dni.substring(0, 8));
        char givenLetter = dni.charAt(8);

        // Calcular la letra correcta
        char correctLetter = LETTERS.charAt(number % 23);

        // Comparar la letra calculada con la proporcionada
        if (givenLetter != correctLetter) {
            throw new ComprobarDNIException("La letra del DNI no es correcta.");
        }

        return true; // DNI válido
    }

    public static void main(String[] args) {
        String[] testDNIs = { "12345678Z", "03220556G", "50363017D", "03224393T", "00000000T", "99997899R", "1234567A", "ABCDEFGH1" };

        for (String dni : testDNIs) {
            try {
                if (isValidDNI(dni)) {
                    System.out.println("✅ " + dni + " es un DNI válido.");
                }
            } catch (ComprobarDNIException e) {
                System.err.println("❌ " + dni + " no es válido: " + e.getMessage());
            }
        }
    }
}
