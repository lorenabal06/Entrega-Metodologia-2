package ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComprobarDNIPruebaTest {
    @Test
    void testDNIValido() {
        // Caso válido con DNI correcto
        try {
            assertTrue(ComprobarDNIPrueba.isValidDNI("12345678Z"));  // Suponiendo que la letra Z es correcta
            assertTrue(ComprobarDNIPrueba.isValidDNI("03220556G"));  // Otro DNI válido
            assertTrue(ComprobarDNIPrueba.isValidDNI("50363017D"));  // Otro DNI válido
        } catch (ComprobarDNIException e) {
            fail("El DNI debería ser válido: " + e.getMessage());
        }
    }

    @Test
    void testFormatoIncorrecto() {
        // Caso con formato incorrecto
        try {
            ComprobarDNIPrueba.isValidDNI("1234567A");  // Menos de 8 números
            fail("Se esperaba una excepción debido al formato incorrecto.");
        } catch (ComprobarDNIException e) {
            assertEquals("El formato del DNI no es válido (debe ser 8 números y una letra mayúscula).", e.getMessage());
        }

        try {
            ComprobarDNIPrueba.isValidDNI("ABCDEFGH1");  // No son números en el inicio
            fail("Se esperaba una excepción debido al formato incorrecto.");
        } catch (ComprobarDNIException e) {
            assertEquals("El formato del DNI no es válido (debe ser 8 números y una letra mayúscula).", e.getMessage());
        }
    }

    @Test
    void testLetraIncorrecta() {
        // Caso con letra incorrecta
        try {
            ComprobarDNIPrueba.isValidDNI("99997899R");  // Letra incorrecta para el número
            fail("Se esperaba una excepción debido a una letra incorrecta.");
        } catch (ComprobarDNIException e) {
            assertEquals("La letra del DNI no es correcta.", e.getMessage());
        }
    }

    @Test
    void testDNINoValido() {
        // Casos con DNIs que no son válidos
        try {
            // Este DNI no es válido (todos los números a 0)
            ComprobarDNIPrueba.isValidDNI("000000000T");  // Se espera una excepción
            fail("Se esperaba una excepción debido a un DNI no válido.");
        } catch (ComprobarDNIException e) {
            assertEquals("El formato del DNI no es válido (debe ser 8 números y una letra mayúscula).", e.getMessage());  // Asegúrate de que el mensaje de la excepción sea el esperado
        }

        try {
            // Otro DNI no válido, en este caso con una letra incorrecta
            ComprobarDNIPrueba.isValidDNI("12345678A");  // Asumiendo que A no es la letra correcta para este número
            fail("Se esperaba una excepción debido a una letra incorrecta.");
        } catch (ComprobarDNIException e) {
            assertEquals("La letra del DNI no es correcta.", e.getMessage());  // Mensaje de error adecuado
        }
    }


}
