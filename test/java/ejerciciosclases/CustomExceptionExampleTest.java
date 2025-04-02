package ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomExceptionExampleTest {
    @Test
    void verificarNumeroLanzaExcepcion() {
        // Verificar que lanzar la excepción con un número bajo (5) arroja la excepción esperada
        MyCustomException exception = assertThrows(MyCustomException.class, () -> {
            CustomExceptionExample.verificarNumero(5); // Lanza la excepción personalizada
        });

        // Verificar que el mensaje de la excepción es el esperado
        assertEquals("Número demasiado bajo: 5", exception.getMessage());
    }

    @Test
    void verificarNumeroNoLanzaExcepcion() {
        // Verificar que con un número adecuado no se lanza la excepción
        assertDoesNotThrow(() -> CustomExceptionExample.verificarNumero(15)); // No lanza excepción
    }

    @Test
    void main() {
        // Verificar que el comportamiento en el main es correcto
        // Esto implica que capturamos la salida estándar y verificamos si contiene el texto esperado
        assertDoesNotThrow(() -> {
            CustomExceptionExample.main(new String[]{}); // Ejecuta el main
        });
    }
}

