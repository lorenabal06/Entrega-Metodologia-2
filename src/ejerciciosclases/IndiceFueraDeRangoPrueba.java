package ejerciciosclases;

// Clase de prueba
public class IndiceFueraDeRangoPrueba {
    public static void verificarIndice(int[] array, int indice) throws IndiceFueraDeRangoException {
        if (indice < 0 || indice >= array.length) {
            throw new IndiceFueraDeRangoException("Índice fuera de rango: " + indice);
        }
        System.out.println("Elemento en la posición " + indice + ": " + array[indice]);
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            verificarIndice(numeros, 1);  // Correcto
            verificarIndice(numeros, 2);  // Correcto
            verificarIndice(numeros, 5);  // Lanza la excepción
        } catch (IndiceFueraDeRangoException ex) {
            System.err.println("Excepción atrapada: " + ex.getMessage());
        }
    }
}
