package ejerciciosclases;

// Paso 2: Usar la excepción en un método
public class NumeroNegativoPrueba{
    public static void verificarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("El número no puede ser negativo");
        }
        System.out.println("Número válido: " + numero);
    }

    public static void main(String[] args) {
        try {
            verificarNumero(10); // No lanza excepción
            verificarNumero(-5); // Lanza excepción
        } catch (NumeroNegativoException ex) {
            System.err.println("Excepción atrapada: " + ex.getMessage());
        }
    }
}
