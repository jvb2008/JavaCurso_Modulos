package m03_Strings;

public class Exercises {
    static void main() {
        String name = "Josu";
        String name2 = "josu";
        String name3 = new String("Josu");
        var surname = new String("Motoso");

        // Equals
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name.equals(name3));

        System.out.println(name);
        System.out.println(surname);
//
//        //Length
        System.out.println(name.length());

        //Obtener un caracter
        System.out.println(name.charAt(0));

        //Subcadenas
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 4));
//
//        //Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
//
//        //Contains
        String world = "Hola Mundo";
        System.out.println(world.contains("hola"));
        System.out.println(world.toLowerCase().contains("hola"));

        //trim
        String world2 = " Hola Mundo ";
        String name4 = "En este curso el profesor se llama Josu";
        System.out.println(world2.trim());

        //replace
        System.out.println(world2.replace(" ", ""));
        System.out.println(name4.replace("Josu", "Juan"));
        System.out.println(name4.replace("profesor", "alumno"));

        //format
        int age = 39;
        System.out.println("Mi nombre es Josu y tengo 39 años");
        System.out.println("Mi nombre es Josu y tengo " + age + " años");
        System.out.println(String.format("Mi nombre es %s y tengo %d años", name, age));
        System.out.print(("Mi nombre es %s y tengo %d años").formatted(name, age));


    }
}
