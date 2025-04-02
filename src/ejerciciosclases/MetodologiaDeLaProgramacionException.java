package ejerciciosclases;

// Excepción personalizada para calificaciones invalidas
class MetodologiaDeLaProgramacionException extends Exception {
  public MetodologiaDeLaProgramacionException(String message) {
    super(message);
  }
}
