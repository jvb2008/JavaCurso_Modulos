package m05_Structures;

import java.util.HashSet;
import java.util.Set;

public class ejercicios {
    static void main() {
        // Crear un Set de tipo String
        Set<String> frutas = new HashSet<>();

        // Agregar elementos
        frutas.add("Manzana");

        // Mostrar el Set
        System.out.println("Contenido del Set: " + frutas);

        // Eliminar un elemento
        frutas.remove("Naranja");
    }
}
