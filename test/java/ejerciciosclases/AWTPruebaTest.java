package ejerciciosclases;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class AWTPruebaTest {

    @Test
    void testMain() {
        // Capturar la salida estándar (System.err)
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        // Ejecutar el método main
        AWTPrueba.main(new String[]{});

        // Restaurar la salida estándar
        System.setErr(System.err);

        // Verificar si se imprimió el mensaje de error en un entorno sin GUI
        if (java.awt.GraphicsEnvironment.isHeadless()) {
            assertTrue(errContent.toString().contains("¡Error de AWT detectado!"),
                    "No se detectó el error de AWT en la salida estándar");
        }
    }
}