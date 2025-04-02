package ejerciciosclases;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundPrueba {
    public static void main(String[] args) {
        String fileName = "datos.txt"; // Nombre del archivo a leer

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("📂 Contenido de " + fileName + ":");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("❌ Error: El archivo '" + fileName + "' no se encontró.");
        }
    }
}

