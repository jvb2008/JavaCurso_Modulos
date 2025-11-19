package m05_Structures;

import java.util.HashSet;

public class SetsPractice {
    static void main() {
        //Declaracion
        HashSet<String> names = new HashSet<>();
        //var names1 = new HashSet<String>();

        //Añadir elementos
        names.add("Josu");
        names.add("josu");
        names.add("Kevin");
        names.add("Mikel");
        names.add("Jonh");
        names.add("Alex");

        System.out.println(names.size());
        System.out.println(names);

        //Acceso
//        System.out.println(names.get(1));
//        System.out.println(names.getLast());
//        System.out.println(names.getFirst());
//        System.out.println(names.indexOf(1));
//        System.out.println(names.lastIndexOf("Josu"));

        //Eliminación
        names.remove("josu");
        System.out.println(names);

        //Búsqueda (contiene /no contiene)
        System.out.println(names.contains("Josu"));

        HashSet<String> names2 = new HashSet<>();
        names2.add("Josu");
        names2.add("Alex1");
        System.out.println(names);
        System.out.println(names2);
//
        names.containsAll(names2);
        System.out.println(names);

        names.retainAll(names2);
        System.out.println(names);


    }
}
