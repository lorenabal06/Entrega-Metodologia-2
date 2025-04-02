package ejerciciosclases;
import java.io.*;

public class EOFPrueba {
    public static void escribirArchivo(String nombreArchivo) throws IOException {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            salida.writeInt(42); // Escribimos un número en el archivo
        }
    }

    public static String leerArchivo(String nombreArchivo) {
        StringBuilder resultado = new StringBuilder();
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            resultado.append("Número leído: ").append(entrada.readInt()).append("\n");
            resultado.append("Intentando leer otro número...\n");
            resultado.append("Número leído: ").append(entrada.readInt()).append("\n"); // Esto genera EOFException
        } catch (EOFException e) {
            resultado.append("¡Se ha alcanzado el final del archivo inesperadamente!\n");
        } catch (IOException e) {
            resultado.append("Error de entrada/salida: ").append(e.getMessage()).append("\n");
        }
        return resultado.toString();
    }

    public static void main(String[] args) throws IOException {
        String nombreArchivo = "datos.txt";
        escribirArchivo(nombreArchivo);
        System.out.println(leerArchivo(nombreArchivo));
        System.out.println("El programa sigue ejecutándose después del error.");
    }
}
