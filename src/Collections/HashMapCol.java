package Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapCol {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1613, "Horus");
        map.put(2406, "Serega");

        for (int i = 0; i < 10; i++) {
            map.put(i,String.valueOf(i));
        }

        System.out.println(map);


//        List<Map.Entry<Integer, String>> list = map.entrySet().stream().filter(x -> x.getKey() > 10).toList();
//
//        System.out.println("-----------");
//
//        list.forEach(System.out::println);

//        map.keySet().stream().forEach(x-> System.out.println("Key: " + x));
//        map.values().stream().forEach(x-> System.out.println("values: " + x));
//        System.out.println("-----------");
//        map.entrySet().stream().forEach(entry -> System.out.println("key: " + entry.getKey() + " " + "value: " + entry.getValue()));
    }
}
