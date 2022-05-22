package Collections;

import java.util.HashMap;

public class HashMapCol {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "test");
        map.put(1613, "horus");
        map.put(2406, "serega");

        System.out.println(map);
    }
}
