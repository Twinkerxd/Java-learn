package GenericPackage;

import ThisPractice.Human;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};

        Integer[] numbers = {0, 1, 2, 3};
        String[] names = {"Serega", "Victor", "Vasya", "Sasha"};
        printAllElements(numbers);
        printAllElements(names);

        Box<String> stringBox = new Box<>();
        stringBox.setT("Serega box");

        Box<Integer> integerBox = new Box<>();
        integerBox.setT(1613);

        System.out.println(stringBox.get());
        System.out.println(integerBox.get());

        List<Integer> list = new ArrayList<>();
    }

    public static <T> void printAllElements(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

class Box<T> {
    private T value;

    public void setT(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
