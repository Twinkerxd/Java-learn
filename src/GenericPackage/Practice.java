package GenericPackage;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        int a = 1613;
        String name = "Serega";
        boolean canDance = true;

        Cat cat = new Cat();
        System.out.println("--------------");

        List<Object> list = new ArrayList<>();
        list.add(a);
        list.add(name);
        list.add(canDance);
        list.add(cat);

        list.forEach(System.out::println);
        System.out.println("=======");
        list.forEach(x -> System.out.println(getTypeName(x)));

        String nothing = "";
        System.out.println(nothing);
    }

    public static <T> void printMe(T something) {
        System.out.println(something);
    }

    public static <T> String getTypeName(T something) {
        return something.getClass().getSimpleName();
    }
}

class Cat {
    String catName;

    public Cat() {
        catName = "Pixi";
    }

    public String toString() {
        return "Hello, I'am a cat. My name is " + catName;
    }
}