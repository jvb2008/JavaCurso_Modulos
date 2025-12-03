package m08_POO;

public class Animal {
    private String name;
    String color;
    int age;
    double weight;

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.println("El animal está comiendo");
    }
}

class Dog extends Animal {
    String legsColor;

    public Dog(String name, String color, int age, double weight, String legsColor) {
        super(name, color, age, weight);
        this.legsColor = legsColor;
    }

    @Override
    public void eat() {
        System.out.println("El perro está comiendo");
    }
}


class Bird extends Animal {
    String wingsColor;

    public Bird(String name, String color, int age, double weight, String wingsColor) {
        super(name, color, age, weight);
        this.wingsColor = wingsColor;
    }

    @Override
    public void eat() {
        System.out.println("El pajaro está comiendo");
    }

    public void fly() {
        System.out.println("El pajaro vuela");
    }

}
