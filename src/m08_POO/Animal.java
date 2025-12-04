package m08_POO;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("GUAU!!");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("MIAU!!");
    }
}

interface Flying {
    void fly();
}

interface Pecker {
    void peck();
}

class Bird extends Animal implements Flying, Pecker {

    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("piopio");
    }

    @Override
    public void fly() {
        System.out.println("El pajaro está volando");
    }

    @Override
    public void peck() {
        System.out.println("El pajaro esta picoteando");
    }
}
