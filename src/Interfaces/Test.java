package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person1 = new Person("Bob");
        animal.showInfo();
        person1.showInfo();

        Info info1 = new Animal(2);
        Info info2 = new Person("Kek");
        info1.showInfo();
        info2.showInfo();

        outputInfo(animal);
        outputInfo(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
