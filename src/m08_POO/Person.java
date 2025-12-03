package m08_POO;

public class Person {
    //Attributes
    private String name;
    private String genre;
    private int age;
    private double height;
    private double weight;


    //Contructor
    public Person(String name, int age, double heigh, double weigh, String genre) {
        this.name = name;
        this.age = age;
        this.height = heigh;
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

    public void sayHelloWithHeight() {
        System.out.println("Hello, my height is: " + this.height);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
