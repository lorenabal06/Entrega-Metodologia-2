package ejerciciosclases;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExceptionTest {

    @Test
    void testMain() {
        // Capturar la salida estándar
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutar el método main
        ArithmeticException.main(new String[]{});

        // Restaurar la salida estándar
        System.setOut(System.out);

        // Convertir la salida a String y verificar los mensajes esperados
        String output = outContent.toString();

        assertTrue(output.contains("Excepción capturada: / by zero"),
                "No se detectó la excepción esperada.");
        assertTrue(output.contains("Se va a finalizar la operación matemática."),
                "No se ejecutó el bloque finally.");
    }
}