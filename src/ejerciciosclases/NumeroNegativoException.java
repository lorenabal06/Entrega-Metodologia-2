package ejerciciosclases;

// Paso 1: Crear la excepción personalizada
public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

