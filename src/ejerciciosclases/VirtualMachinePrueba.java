package ejerciciosclases;

import java.util.ArrayList;
import java.util.List;

public class VirtualMachinePrueba {
    public static void main(String[] args) {
        try {
            List<int[]> lista = new ArrayList<>();
            while (true) {
                lista.add(new int[Integer.MAX_VALUE / 100]); // Intento de asignar mucha memoria
            }
        } catch (OutOfMemoryError e) { // Captura el error de falta de memoria
            System.err.println("¡Error detectado! " + e);
        }

        System.out.println("Si este mensaje aparece, el error fue manejado.");
    }
}

