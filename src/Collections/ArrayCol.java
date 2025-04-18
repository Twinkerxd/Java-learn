package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayCol {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        System.out.println("------------------");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        System.out.println(list);


    }



}