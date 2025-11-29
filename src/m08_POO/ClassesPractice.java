package m08_POO;

public class ClassesPractice {
    static void main() {
        Person person = new Person("Josu", 18, 1.78, 80, "man");
        person.sayHello();
        person.sayHelloWithAge();
        person.age = 25;

//        Vehicle car1 = new Vehicle("Mikel");
//        car1.arrancar();

    }
}
