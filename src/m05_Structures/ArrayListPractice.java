package m05_Structures;

import java.util.ArrayList;

public class ArrayListPractice {
    static void main() {
        //Declaracion
        ArrayList<String> names = new ArrayList<>();

        names.add("Josu");
        names.add("Mikel");
        names.add("Juan");
        names.add("Kevin");
        names.add("Leandro");
        names.add("Josu");

        System.out.println("Nombres " + names);

        //Acceso
        System.out.println(names.get(2));
        System.out.println(names.getLast());
        System.out.println(names.getFirst());
        System.out.println(names.indexOf("Josu"));
        System.out.println(names.lastIndexOf("Josu"));

        //Modificaciones
        names.add(3, "Alex");
        System.out.println(names);

        //Eliminar
//        names.remove(0);
//        names.remove(names.getLast());
        names.removeLast();
        System.out.println(names);

        //Busquedas
        System.out.println(names.contains("Mikel1"));

        //Clonado
        ArrayList<String> namesClone = new ArrayList<>();
        namesClone = (ArrayList<String>) names.clone();
        System.out.println(namesClone);


        //Limpieza
        names.clear();
        System.out.println(names);
    }
}
