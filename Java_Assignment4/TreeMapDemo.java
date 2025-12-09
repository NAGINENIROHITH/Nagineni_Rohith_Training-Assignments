package Java_Assignment4;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(4, "Mango");
        map.put(2, "Orange");

        // Ascending Order (default)
        System.out.println("TreeMap in Ascending Order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }

        // Descending Order
        System.out.println("\nTreeMap in Descending Order:");
        for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
    }
}
