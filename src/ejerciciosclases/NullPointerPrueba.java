package ejerciciosclases;

public class NullPointerPrueba {
    public static void main(String[] args) {
        try {
            String texto = null; // Variable nula
            System.out.println("Longitud del texto: " + texto.length()); // Provoca NullPointerException
        } catch (NullPointerException e) {
            System.err.println("¡Se ha producido un NullPointerException! " + e.getMessage());
        }

        System.out.println("El programa sigue ejecutándose después del error.");
    }
}

