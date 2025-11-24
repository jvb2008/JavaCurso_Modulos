package m05_Structures;

import java.util.HashMap;

public class HashMapsPractice {
    static void main() {
        //Definición
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Josu");
        names.put(24, "Alex");
        names.put(37, "Juan");
        names.put(4, "Ivan");
        names.put(59, "Mikel");
        names.put(60, "Eduardo");
        System.out.println(names);

        //Acceso
        System.out.println(names.get(60));


        //ELiminar valores
        names.remove(4);
        System.out.println(names);
        System.out.println(names.getOrDefault(4, "Ivan"));

        //Reemplazar
        names.replace(59, "Leandro");
        System.out.println(names);
        names.putIfAbsent(61, "Josu2");
        names.put(59, "Leandro2");
        System.out.println(names);

        System.out.println(names.keySet());

        HashMap<Integer, String> names2 = new HashMap<>();
        names2.putAll(names);
        System.out.println(names2);

        System.out.println(names.containsValue("Leandro"));

    }
}
