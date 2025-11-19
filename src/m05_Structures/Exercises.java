package m05_Structures;

import java.util.Arrays;

public class Exercises {
    static void main() {
        // definicion de arrays
        int[] edades = new int[4];

        edades[0] = 18;
        System.out.println(Arrays.toString(edades));

//        int[] edades = {18, 25, 35, 45};
//        System.out.println(edades);
//        System.out.println(Arrays.toString(edades));

        String[] nombres = {"Josu", "Alex", "Leandro", "Osvaldo"};
        System.out.println(nombres);
        System.out.println(Arrays.toString(nombres));
//
//        //Accesos
        System.out.println(nombres[0]);
        System.out.println(nombres[nombres.length - 1]);
//
//        //Modificaciones
        nombres[0] = "Jonh";
        System.out.println(Arrays.toString(nombres));
        System.out.println(nombres.length);
//
//        nombres[1] = 0;
//        edades[0] = null;


//        System.out.println(Arrays.toString(nombres));
//
        boolean[] booleans = {3 > 2, 3 < 2, true, true};
        System.out.println(Arrays.toString(booleans));


    }
}
