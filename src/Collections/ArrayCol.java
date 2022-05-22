package Collections;

import java.util.ArrayList;

public class ArrayCol {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

    }
}