package ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class Dividir0Test {
    @Test
    void main() {
        // Verificar si la excepción ArithmeticException es lanzada cuando se divide por 0
        assertThrows(java.lang.ArithmeticException.class, () -> Dividir0.dividirEntreCero(10, 0));
    }
}


