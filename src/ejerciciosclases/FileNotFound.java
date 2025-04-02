package ejerciciosclases;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        // Ruta del archivo que queremos leer
        File file = new File("archivo_inexistente.txt");
        // Almacenamos el archivo en una variable

        try (Scanner scanner = new Scanner(file)) {
            // Usamos Scanner para interactuar el operador con la máquina
            System.out.println("Archivo encontrado y leído.");
            // Se ejecuta si el archivo se ha encontrado
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                // Permite pasar a finally al ver que el archivo se encontró
            }
        }

        // Se ejecuta si el archivo no ha sido encontrado
        catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        }

        // Se ejecuta siempre
        finally {
            System.out.println("Finalizando la búsqueda del archivo.");
        }
    }
}

