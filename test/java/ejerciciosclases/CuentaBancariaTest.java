package ejerciciosclases;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    private CuentaBancaria cuenta;

    // Este método se ejecutará antes de cada prueba, inicializando la cuenta con saldo 100
    @BeforeEach
    void setUp() {
        cuenta = new CuentaBancaria("12345678", 100.0);
    }

    // Prueba para el método depositar
    @Test
    void depositar_Valido() {
        cuenta.depositar(50.0);
        assertEquals(150.0, cuenta.getSaldo(), "El saldo después del depósito debería ser 150");
    }

    // Prueba para el método depositar con cantidad negativa
    @Test
    void depositar_Invalido_CantidadNegativa() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.depositar(-50.0);
        });
        assertEquals("La cantidad a depositar debe ser mayor que cero.", exception.getMessage());
    }

    // Prueba para el método depositar con cantidad cero
    @Test
    void depositar_Invalido_CantidadCero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.depositar(0.0);
        });
        assertEquals("La cantidad a depositar debe ser mayor que cero.", exception.getMessage());
    }

    // Prueba para el método retirar con saldo suficiente
    @Test
    void retirar_Valido() {
        cuenta.retirar(50.0);
        assertEquals(50.0, cuenta.getSaldo(), "El saldo después del retiro debería ser 50");
    }

    // Prueba para el método retirar con saldo insuficiente
    @Test
    void retirar_Invalido_SaldoInsuficiente() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(200.0);  // Se intenta retirar más de lo que hay en la cuenta
        });
        assertEquals("Saldo insuficiente para realizar la operación.", exception.getMessage());
    }

    // Prueba para el método retirar con cantidad negativa
    @Test
    void retirar_Invalido_CantidadNegativa() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(-50.0);  // Se intenta retirar una cantidad negativa
        });
        assertEquals("La cantidad a retirar debe ser mayor que cero.", exception.getMessage());
    }

    // Prueba para el método retirar con cantidad cero
    @Test
    void retirar_Invalido_CantidadCero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(0.0);  // Se intenta retirar cero
        });
        assertEquals("La cantidad a retirar debe ser mayor que cero.", exception.getMessage());
    }
}
