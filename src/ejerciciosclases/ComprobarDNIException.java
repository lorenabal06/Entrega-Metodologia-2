package ejerciciosclases;

// Excepción personalizada para DNI inválido
class ComprobarDNIException extends Exception {
    public ComprobarDNIException(String message) {
        super(message);
    }
}
