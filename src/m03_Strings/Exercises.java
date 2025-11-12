package m03_Strings;

public class Exercises {
    static void main() {
        String name = "Josu";
        var surname = new String("Motoso");

        System.out.println(name);
        System.out.println(surname);

        //length
        System.out.println(name.length());

        //obtener un caracter
        System.out.println(name.charAt(0));

        //Subcadenas
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 4));

        //Mayusculas y minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


    }
}
