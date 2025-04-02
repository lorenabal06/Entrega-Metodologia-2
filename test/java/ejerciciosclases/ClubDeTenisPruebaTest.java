package ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClubDeTenisPruebaTest {

    // Test para verificar si ingresar al club funciona correctamente
    @Test
    void ingresarAlClub() {
        // Probamos con un caso válido
        try {
            ClubDeTenisPrueba.ingresarAlClub(25, true);  // Edad válida y tiene carnet
        } catch (ClubDeTenisException e) {
            fail("No se esperaba una excepción para este caso válido.");
        }

        // Probamos con un caso de edad no válida (menor de 18)
        try {
            ClubDeTenisPrueba.ingresarAlClub(17, true);  // Edad menor a 18
            fail("Se esperaba una excepción para la edad menor a 18.");
        } catch (ClubDeTenisException e) {
            assertEquals("Edad no válida. Debes tener entre 18 y 30 años.", e.getMessage());
        }

        // Probamos con un caso de edad no válida (mayor de 30)
        try {
            ClubDeTenisPrueba.ingresarAlClub(35, true);  // Edad mayor a 30
            fail("Se esperaba una excepción para la edad mayor a 30.");
        } catch (ClubDeTenisException e) {
            assertEquals("Edad no válida. Debes tener entre 18 y 30 años.", e.getMessage());
        }

        // Probamos con un caso sin carnet de conducir
        try {
            ClubDeTenisPrueba.ingresarAlClub(25, false);  // Edad válida pero sin carnet
            fail("Se esperaba una excepción para no tener carnet de conducir.");
        } catch (ClubDeTenisException e) {
            assertEquals("No tienes carnet de conducir. Necesitas uno para ingresar al club.", e.getMessage());
        }
    }

    // Test para verificar el flujo del método main
    @Test
    void main() {
        // Redirigimos la salida estándar y de error para capturar la salida de los System.out.println() y System.err.println()
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        java.io.ByteArrayOutputStream errContent = new java.io.ByteArrayOutputStream();
        System.setErr(new java.io.PrintStream(errContent));

        // Llamamos al método main que contiene la lógica que queremos probar
        ClubDeTenisPrueba.main(new String[]{});

        // Verificamos que la salida de error contiene los mensajes correctos de excepción
        String errorOutput = errContent.toString();
        assertTrue(errorOutput.contains("❌ Usuario 2 no es válido: Edad no válida. Debes tener entre 18 y 30 años."));
        assertTrue(errorOutput.contains("❌ Usuario 5 no es válido: Edad no válida. Debes tener entre 18 y 30 años."));
        assertTrue(errorOutput.contains("❌ Usuario 4 no es válido: No tienes carnet de conducir. Necesitas uno para ingresar al club."));

        // Verificamos que la salida estándar contiene el mensaje correcto para los casos válidos
        String output = outContent.toString();
        assertTrue(output.contains("✅ Usuario con edad 20 y carnet de conducir sí: ¡Bienvenido al Club de Tenis! Puedes ingresar."));
        assertTrue(output.contains("✅ Usuario con edad 30 y carnet de conducir sí: ¡Bienvenido al Club de Tenis! Puedes ingresar."));
    }
}
