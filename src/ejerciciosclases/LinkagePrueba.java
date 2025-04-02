package ejerciciosclases;

public class LinkagePrueba {
    static {
        try {
            new LinkagePrueba(); // Intento de crear un bucle infinito
        } catch (Throwable e) { // Captura cualquier error o excepción
            System.err.println("¡Error detectado! " + e);
        }
    }

    public LinkagePrueba() {
        new LinkagePrueba(); // ❌ Llamada recursiva al constructor
    }

    public static void main(String[] args) {
        System.out.println("Si este mensaje aparece, el error fue manejado.");
    }
}

