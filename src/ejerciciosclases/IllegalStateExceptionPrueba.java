package ejerciciosclases;

public class IllegalStateExceptionPrueba {
    public static void main(String[] args) {
        // Simulamos un proceso con un estado
        String[] estados = { "iniciado", "en proceso", "finalizado", "bloqueado" };

        // Probamos transitar entre los diferentes estados
        for (String estado : estados) {
            try {
                cambiarEstado(estado);
            } catch (IllegalStateException e) {
                System.err.println("❌ Error: " + e.getMessage());
            }
        }
    }

    // Método que simula cambiar de estado, pero lanza una excepción si el estado es "bloqueado"
    public static void cambiarEstado(String estado) throws IllegalStateException {
        System.out.println("Intentando cambiar al estado: " + estado);

        // Simulamos que el estado "bloqueado" no es válido en ciertas condiciones
        if (estado.equals("bloqueado")) {
            throw new IllegalStateException("No se puede cambiar al estado 'bloqueado' en este momento.");
        }

        // Simulación exitosa de cambio de estado
        System.out.println("✅ Cambio de estado exitoso a: " + estado);
    }
}
