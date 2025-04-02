package ejerciciosclases;

// Clase que representa la asignatura MetodologiaDeLaProgramacion
public class MetodologiaDeLaProgramacionPrueba {

    // Método que clasifica la nota
    public static String clasificarNota(double nota) throws MetodologiaDeLaProgramacionException {
        if (nota < 0 || nota > 10) {
            throw new MetodologiaDeLaProgramacionException("❌ La nota debe estar entre 0 y 10.");
        }

        if (nota < 5) {
            return "Suspenso";
        } else if (nota >= 5 && nota < 6) {
            return "Aprobado";
        } else if (nota >= 6 && nota < 7) {
            return "Bien";
        } else if (nota >= 7 && nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    public static void main(String[] args) {
        // Array de notas para probar
        double[] notas = {4.5, 6.3, 8.7, 9.5, 10, -1, 15};

        // Probar las notas y manejar las excepciones
        for (double nota : notas) {
            try {
                String clasificacion = clasificarNota(nota);
                System.out.println("Nota: " + nota + " - Clasificación: " + clasificacion);
            } catch (MetodologiaDeLaProgramacionException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

