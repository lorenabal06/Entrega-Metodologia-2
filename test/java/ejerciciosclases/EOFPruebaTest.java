package ejerciciosclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class EOFPruebaTest {

    @Test
    void testLeerArchivoEOF() throws IOException {
        String nombreArchivo = "test_datos.txt";
        EOFPrueba.escribirArchivo(nombreArchivo);

        String salida = EOFPrueba.leerArchivo(nombreArchivo);

        assertTrue(salida.contains("Número leído: 42"));
        assertTrue(salida.contains("Intentando leer otro número..."));
        assertTrue(salida.contains("¡Se ha alcanzado el final del archivo inesperadamente!"));
    }
}
