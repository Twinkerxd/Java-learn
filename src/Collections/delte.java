package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class delte {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }


        Set<Integer> collect = Arrays.stream(array).mapToObj(x -> x + 5).collect(Collectors.toSet());
        System.out.println(collect);


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            list.add(i);
        }

        list = list.stream().filter(x -> x < 5).toList();

        System.out.println(list);


        List<String> list2 = new ArrayList<>();
        list2.add("kek");
        list2.add("lol");
        list2.add("kappa");

        list2.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        list2 = list2.stream().filter(x -> x.contains("k")).toList();
        System.out.println(list2);

        list2 = list2.stream().filter(x -> x.length() == 3).toList();
        System.out.println(list2);

        list2 = list2.stream().map(x -> x.toUpperCase()).toList();
        System.out.println(list2);

        list2 = list2.stream().map(x -> x.replace("K", "X")).toList();
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list3.add(i);
        }

        list3 = list3.stream().skip(20).toList();
        System.out.println(list3);

        list3 = list3.stream().limit(13).toList();
        System.out.println(list3);

        list3 = list3.stream().map(x -> x * 100).toList();
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(1);
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);

        list4.forEach(x -> System.out.println(x + " "));
        System.out.println("---------------");
        list4.stream().distinct().forEach(x -> System.out.println(x + " "));
    }
}
