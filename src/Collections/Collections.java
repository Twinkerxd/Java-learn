package Collections;

import java.util.*;

public class Collections {


    public static void main(String[] args) {
        //TODO LIST
        List<String> names = List.of("Victor", "Sergei");

        //TODO ARRAY LIST
        List<String> arrayList = new ArrayList<>();
        arrayList.add("kek");
        arrayList.add("lol");
        arrayList.set(1, "lul");
        arrayList.forEach(System.out::println);

        //TODO SET
        System.out.println("-----SET------");
        Set<String> set = Set.of("1", "2", "3", "4", "5");

        // for each
        for (String s : set) {
            System.out.println(s);
        }

        // for each, stream api
        set.stream().forEach(System.out::println);

        // lyambda
        set.stream().forEach(x-> System.out.println(x));

        // iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //TODO HASH SET
        System.out.println("-----HASH SET------");
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i < 11; i++) {
            hashSet.add(i);
        }
        hashSet.forEach(System.out::println);

        //TODO MAP
        System.out.println("-----MAP------");
        Map<Integer, String> map = Map.of(1, "Sergei", 2, "Oleg", 3, "Dima");
        System.out.println(map.get(1));

        //TODO HASHMAP
        System.out.println("-----HASH MAP------");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1613, "Horus");
        hashMap.put(1, "Serega");
        hashMap.put(2, "Lukasz");
        hashMap.put(3, "Karolina");
        hashMap.put(4, "Mateusz");
        hashMap.put(5, "Hubert");

        System.out.println(hashMap);


        //TODO task 1
        String word1 = "kajak";
        String word2 = "qwerty";

        System.out.println("kajak: " + isCharEquals(word1));
        System.out.println("qwerty: " + isCharEquals(word2));
    }

    public static Boolean isCharEquals(String word) {
        HashMap<Integer, Character> charHashMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            charHashMap.put(i, word.charAt(i));
        }

        HashMap<Integer, Character> charHashMap2 = new HashMap<>();

        for (int i = charHashMap.size() - 1; i >= 0; i--) {
            charHashMap2.put(charHashMap.size() - 1 - i, charHashMap.get(i));
        }

        return charHashMap.equals(charHashMap2);
    }
}
