package Objects;

public class SomeObjects {
    public static void main(String[] args) {
        Animal animal = new Animal("Pixi", 1);
        animal.sayHello();
    }
}

class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello() {
        System.out.println("Hello! My name is " + name + " and my age is " + age);
    }
}
