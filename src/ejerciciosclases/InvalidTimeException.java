package ejerciciosclases;

// Excepción personalizada
class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}
