package ejerciciosclases;

public class NoClassDefFoundErrorPrueba {
    public static void main(String[] args) {
        try {
            // Intentamos cargar una clase que no existe, lo que generará un NoClassDefFoundError
            Class.forName("myPackage.ClaseNoExistente"); // Esta clase no existe
        } catch (ClassNotFoundException e) {
            // Si no se encuentra la clase, la manejamos como un NoClassDefFoundError
            throw new NoClassDefFoundError("La clase 'ClaseNoExistente' no fue encontrada.");
        } catch (NoClassDefFoundError e) {
            // Aquí manejamos el error específico NoClassDefFoundError
            System.err.println("❌ Error: No se encontró la clase. " + e.getMessage());
        }

        // Llamamos a las clases definidas sin generar errores
        // Este código no debería lanzar excepciones
        System.out.println("Ejecutando MethodCallStackDemo...");
        MethodCallStackDemo.main(args);  // Llamamos a methodCallStackDemo para que no dé error

        System.out.println("Ejecutando MetodologiaDeLaProgramacionPrueba...");
        double[] notas = {4.5, 6.3, 8.7, 9.5, 10, -1, 15};
        for (double nota : notas) {
            try {
                String clasificacion = MetodologiaDeLaProgramacionPrueba.clasificarNota(nota);
                System.out.println("Nota: " + nota + " - Clasificación: " + clasificacion);
            } catch (MetodologiaDeLaProgramacionException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
