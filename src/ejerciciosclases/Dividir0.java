package ejerciciosclases;

public class Dividir0 {
    public static void main(String[] args) {
        try {
            // Da error por dividir entre 0
            dividirEntreCero(10, 0);
        } finally {
            System.out.println("El programa continúa después del catch.");
        }
    }

    public static void dividirEntreCero(int i, int i1) {
        // Da error por dividir entre 0
        int resultado = 10 / 0;
    }
}

