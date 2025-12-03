package m08_POO;

public class ClassesPractice {
    static void main() {
        Person person = new Person("Josu", 18, 1.78, 80, "man");
        person.sayHello();
        person.sayHelloWithAge();
//        person.age = 25;

        person.sayHelloWithAge();
        person.sayHelloWithHeight();
//        person.height = 1.85;
        person.sayHelloWithHeight();
        System.out.println(person.getAge());
        person.setAge(25);
        System.out.println(person.getAge());
    }
}
