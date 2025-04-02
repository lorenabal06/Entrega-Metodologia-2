package ejerciciosclases;

// Clase principal
public class ClubDeTenisPrueba {

    // Método para ingresar al club
    public static void ingresarAlClub(int edad, boolean tieneCarnetDeConducir) throws ClubDeTenisException {
        if (edad < 18 || edad > 30) {
            throw new ClubDeTenisException("Edad no válida. Debes tener entre 18 y 30 años.");
        }
        if (!tieneCarnetDeConducir) {
            throw new ClubDeTenisException("No tienes carnet de conducir. Necesitas uno para ingresar al club.");
        }
        System.out.println("✅ Usuario con edad " + edad + " y carnet de conducir " + (tieneCarnetDeConducir ? "sí" : "no") + ": ¡Bienvenido al Club de Tenis! Puedes ingresar.");
    }

    // Método main para comprobar varios usuarios
    public static void main(String[] args) {
        // Arrays con las edades y si los usuarios tienen carnet de conducir
        int[] edades = {20, 17, 30, 25, 35};
        boolean[] carnetsDeConducir = {true, true, true, false, true};

        // Recorremos los usuarios
        for (int i = 0; i < edades.length; i++) {
            try {
                ingresarAlClub(edades[i], carnetsDeConducir[i]);
            } catch (ClubDeTenisException e) {
                // Si hay un error, se imprime en rojo con un mensaje de error
                System.err.println("❌ Usuario " + (i + 1) + " no es válido: " + e.getMessage());
            }
        }
    }
}
