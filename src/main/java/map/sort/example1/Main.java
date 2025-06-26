package map.sort.example1;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 3);
        map.put("cherry", 1);

        Stream<Map.Entry<String, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        System.out.println(sorted);



    }
}
