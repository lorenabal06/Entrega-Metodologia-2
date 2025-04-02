package ejerciciosclases;

import java.io.*;

public class InterruptedIOPrueba {
    public static void main(String[] args) {
        try {
            // Simulamos una operación de lectura de un archivo
            InputStream inputStream = new FileInputStream("archivo.txt");

            // Simulamos una interrupción mientras se lee del archivo
            try {
                Thread.sleep(1000); // Simula un proceso de espera
            } catch (InterruptedException e) {
                System.err.println("¡El hilo fue interrumpido! Detalles: " + e.getMessage());
                return; // Sale del programa si el hilo es interrumpido
            }

            // Lanza una InterruptedIOException para simular la interrupción en la operación de I/O
            throw new InterruptedIOException("Se interrumpió la operación de lectura.");

        } catch (InterruptedIOException e) {
            System.err.println("¡Error de IO interrumpido! Detalles: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida general: " + e.getMessage());
        }

        System.out.println("El programa sigue ejecutándose después del error.");
    }
}

