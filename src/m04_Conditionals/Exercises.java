package m04_Conditionals;

public class Exercises {
    static void main() {
        int age = 39;
        String name = "Josu";

        if (age > 18 && name.equals("Josu")) {
            System.out.println("Soy mayor de edad y ademas me llamo Josu");
        } else if (age == 18) {
            System.out.println("Acabo de cumplir 18 años");
        } else {
            System.out.println("Soy menor de edad");
        }


        String favouriteColor = "Rojo";

//        switch (favouriteColor) {
//            case "Rojo":
//                System.out.println("Es mi color favorito " + favouriteColor);
//                break;
//            case "Verde":
//                System.out.println("Es mi color favorito");
//                break;
//            case "Azul":
//                System.out.println("Es mi color favorito");
//                break;
//            case "Negro":
//                System.out.println("Es mi color favorito");
//                break;
//            default:
//                System.out.println("No es mi color favorito");
//        }

//        if (favouriteColor.equals("Rojo")) {
//            System.out.println("Es mi color favorito");
//        } else {
//            System.out.println("No es mi color favorito");
//        }


    }
}
