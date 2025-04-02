package ejerciciosclases;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculosPromedioTest {

    // Test para verificar el cálculo del promedio
    @Test
    void calcularPromedio() {
        // Test con un conjunto de números
        int[] numeros = {10, 20, 30, 40};
        try {
            double resultado = CalculosPromedio.calcularPromedio(numeros);
            assertEquals(25.0, resultado, "El promedio debe ser 25.0");
        } catch (DivisorCeroException e) {
            fail("No se esperaba una excepción: " + e.getMessage());
        }

        // Test con un conjunto vacío (debe lanzar excepción)
        int[] numerosVacios = {};
        assertThrows(DivisorCeroException.class, () -> CalculosPromedio.calcularPromedio(numerosVacios),
                "Se esperaba una excepción DivisorCeroException para el conjunto vacío.");
    }

    // Test para el método metodoB
    @Test
    void metodoB() {
        // Llamamos al método metodoB y verificamos que no lance excepciones
        try {
            CalculosPromedio.metodoB();
        } catch (DivisorCeroException e) {
            fail("No se esperaba una excepción: " + e.getMessage());
        }
    }

    // Test para el método metodoC
    @Test
    void metodoC() {
        // Llamamos al método metodoC y verificamos que no lance excepciones
        try {
            CalculosPromedio.metodoC();
        } catch (DivisorCeroException e) {
            fail("No se esperaba una excepción: " + e.getMessage());
        }
    }

    // Test para el método metodoA
    @Test
    void metodoA() {
        // Verificamos que no haya excepciones al llamar a metodoA
        try {
            CalculosPromedio.metodoA();
        } catch (Exception e) {
            fail("No se esperaba una excepción en metodoA: " + e.getMessage());
        }
    }

    // Test para el método main
    @Test
    void main() {
        // Verificamos que al llamar al método main no se lance ninguna excepción
        assertDoesNotThrow(() -> CalculosPromedio.main(new String[]{}),
                "No se esperaba una excepción al ejecutar main.");
    }
}
