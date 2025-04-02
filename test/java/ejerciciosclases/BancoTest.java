package ejerciciosclases;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BancoTest {

    @Test
    void testDepositoNegativo() {
        // Creamos una cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("987654", 500.0);

        // Intentamos depositar una cantidad negativa
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-100));
        assertEquals("La cantidad a depositar debe ser mayor que cero.", exception.getMessage());
    }

    @Test
    void testDepositoCorrecto() {
        // Creamos una cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("987654", 500.0);

        // Realizamos un depósito correcto
        cuenta.depositar(300.0);

        // Verificamos que el saldo se haya actualizado correctamente
        assertEquals(800.0, cuenta.getSaldo(), "El saldo después del depósito debe ser 800.0");
    }

    @Test
    void testRetiroCorrecto() {
        // Creamos una cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("987654", 500.0);

        // Realizamos un retiro correcto
        cuenta.retirar(200.0);

        // Verificamos que el saldo se haya actualizado correctamente
        assertEquals(300.0, cuenta.getSaldo(), "El saldo después del retiro debe ser 300.0");
    }

    @Test
    void testRetiroConSaldoInsuficiente() {
        // Creamos una cuenta bancaria con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria("987654", 500.0);

        // Intentamos retirar más de lo que hay en la cuenta
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(600));
        assertEquals("Saldo insuficiente para realizar la operación.", exception.getMessage());
    }
}
