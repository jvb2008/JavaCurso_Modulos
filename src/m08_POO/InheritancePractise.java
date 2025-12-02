package m08_POO;

public class InheritancePractise {
    static void main() {
        Animal animal = new Animal("Josu", "Negro", 5, 15.5);
//        System.out.println("El animal se llama: " + animal.getName());
        animal.eat();


        Dog dog = new Dog("firulai", "Negro", 8, 10.5, "Brown");
        dog.eat();

        Bird bird = new Bird("Birdy", "White", 1, 3.5, "Grey");
        bird.eat();
        bird.fly();
    }
}
