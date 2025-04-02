package ejerciciosclases;

import java.io.*;

public class EOFPrueba {
    public static void main(String[] args) {
        try {
            // Creamos un archivo temporal con datos
            File archivo = new File("datos.txt");
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));
            salida.writeInt(42); // Escribimos un número en el archivo
            salida.close();

            // Intentamos leer más datos de los que hay en el archivo
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
            System.out.println("Número leído: " + entrada.readInt());
            System.out.println("Intentando leer otro número...");
            System.out.println("Número leído: " + entrada.readInt()); // Esto genera EOFException

            entrada.close();
        } catch (EOFException e) {
            System.err.println("¡Se ha alcanzado el final del archivo inesperadamente!");
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }

        System.out.println("El programa sigue ejecutándose después del error.");
    }
}
