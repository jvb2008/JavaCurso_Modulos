package m08_POO;

public class Person {
    //Attributes
    String name;
    int age;
    double heigh;
    double weight;
    String genre;

    //Contructor
    public Person(String name, int age, double heigh, double weigh, String genre) {
        this.name = name;
        this.age = age;
        this.heigh = heigh;
        this.weight = weigh;
        this.genre = genre;
    }

    //Methods
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayHelloWithAge() {
        System.out.println("Hello, my age is: " + this.age);
    }


}
