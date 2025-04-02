package ejerciciosclases;

public class ClassCastExceptionPrueba {
    public static void main(String[] args) {
        // Array de objetos de tipo Object
        Object[] objects = { "Texto", 123, 45.67, true };

        // Intentamos hacer cast a diferentes tipos
        for (Object obj : objects) {
            try {
                // Intentamos hacer cast a String
                String str = (String) obj;
                System.out.println("La cadena es: " + str);
            } catch (ClassCastException e) {
                // Si no es posible hacer el cast, se lanza una ClassCastException
                System.err.println("❌ No se puede convertir el objeto " + obj.getClass().getSimpleName() + " a String: " + e.getMessage());
            }

            try {
                // Intentamos hacer cast a Integer
                Integer integer = (Integer) obj;
                System.out.println("El número entero es: " + integer);
            } catch (ClassCastException e) {
                // Si no es posible hacer el cast, se lanza una ClassCastException
                System.err.println("❌ No se puede convertir el objeto " + obj.getClass().getSimpleName() + " a Integer: " + e.getMessage());
            }

            try {
                // Intentamos hacer cast a Double
                Double d = (Double) obj;
                System.out.println("El número decimal es: " + d);
            } catch (ClassCastException e) {
                // Si no es posible hacer el cast, se lanza una ClassCastException
                System.err.println("❌ No se puede convertir el objeto " + obj.getClass().getSimpleName() + " a Double: " + e.getMessage());
            }

            try {
                // Intentamos hacer cast a Boolean
                Boolean b = (Boolean) obj;
                System.out.println("El valor booleano es: " + b);
            } catch (ClassCastException e) {
                // Si no es posible hacer el cast, se lanza una ClassCastException
                System.err.println("❌ No se puede convertir el objeto " + obj.getClass().getSimpleName() + " a Boolean: " + e.getMessage());
            }
        }
    }
}
