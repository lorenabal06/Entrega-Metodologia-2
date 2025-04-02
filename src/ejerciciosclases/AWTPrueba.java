package ejerciciosclases;

import java.awt.*;

public class AWTPrueba {
    public static void main(String[] args) {
        try {
            // Verificamos si el entorno gráfico está disponible
            if (GraphicsEnvironment.isHeadless()) {
                throw new AWTError("¡No hay entorno gráfico disponible!");
            }

            // Intentamos crear una ventana
            Frame ventana = new Frame("Prueba AWTError");
            ventana.setSize(400, 300);
            ventana.setVisible(true);
        } catch (AWTError e) { // Captura el error de entorno gráfico
            System.err.println("¡Error de AWT detectado! " + e);
        }
    }
}

