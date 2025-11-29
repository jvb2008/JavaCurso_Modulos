package m08_POO;

import java.util.ArrayList;

abstract class Vehicle {

    private String marca;

    public Vehicle(String marca) {
        this.marca = marca;
    }

    abstract void arrancar();

    void frenar() {
        System.out.println("El vehiculo está frenando");
    }

}

class Moto extends Vehicle {
    public Moto(String name) {
        super(name);
    }

    @Override
    void arrancar() {
        System.out.println("La moto está arrancando");
    }
}

interface volador {
    void volar();
}


class Avion extends Vehicle implements volador {
    public Avion(String name) {
        super(name);
    }

    @Override
    void arrancar() {
        System.out.println("El avión está arrancando");
    }

    @Override
    public void volar() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        try {
            System.out.println(arr.get(4));
        } catch (Exception ex) {
            System.out.println("Error");
        }


    }
}
