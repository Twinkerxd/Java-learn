package WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1));
        animalList.add(new Animal(2));

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        test(animalList);
        test(dogList);
        test(catList);
    }

    static void test(List<? extends Animal> animalList) {
        for (Animal animal : animalList) {
            animal.eat();
        }
    }
}
