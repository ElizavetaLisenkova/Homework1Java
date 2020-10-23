package Seminar4;

import java.util.*;

public class Task2 {

    public static <V, K> HashMap<V, K> reverse(Map<K, V> map) {
        HashMap<V, K> newMap = new HashMap<>();
        for (Map.Entry<K,V> entry: map.entrySet()) {
            if (newMap.containsKey(entry.getValue())) {
                Set<K> set = new HashSet<>();
                set.add(newMap.get(entry.getValue()));
                set.add(entry.getKey());
                newMap.replace(entry.getValue(), (K) set);
            } else {
                newMap.put(entry.getValue(), entry.getKey());
            }
        }
        return newMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "a");
        map.put(5, "a");

        System.out.println(reverse(map));
    }
}
