package Collections;

import java.util.ArrayList;

public class ArrayListCol {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}