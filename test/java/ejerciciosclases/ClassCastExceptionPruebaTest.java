package ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassCastExceptionPruebaTest {

    // Test para verificar que las excepciones ClassCastException son lanzadas correctamente
    @Test
    void main() {
        // Redirigimos la salida estándar y de error para capturar la salida de los System.out.println() y System.err.println()
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        java.io.ByteArrayOutputStream errContent = new java.io.ByteArrayOutputStream();
        System.setErr(new java.io.PrintStream(errContent));

        // Llamamos al método main que contiene la lógica que queremos probar
        ClassCastExceptionPrueba.main(new String[]{});

        // Verificamos que la salida estándar contenga los mensajes esperados
        String output = outContent.toString();
        assertTrue(output.contains("La cadena es: Texto"));
        assertTrue(output.contains("El número entero es: 123"));
        assertTrue(output.contains("El número decimal es: 45.67"));
        assertTrue(output.contains("El valor booleano es: true"));

        // Verificamos que la salida de error contenga los mensajes de error correspondientes
        String errorOutput = errContent.toString();
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Integer a String"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Double a String"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Boolean a String"));

        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto String a Integer"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Double a Integer"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Boolean a Integer"));

        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto String a Double"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Integer a Double"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Boolean a Double"));

        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto String a Boolean"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Integer a Boolean"));
        assertTrue(errorOutput.contains("❌ No se puede convertir el objeto Double a Boolean"));
    }
}
