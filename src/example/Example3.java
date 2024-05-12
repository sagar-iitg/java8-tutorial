package example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args) {

//        Map<String, Integer> scores = new HashMap<>();
//        scores.put("Alice", 85);
//        scores.put("Bob", 92);
//        scores.put("Charlie", 78);
//
//        scores.entrySet().stream()
//                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));



        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        Map<String, Integer> highScorers = scores.entrySet().stream()
                .filter(entry -> entry.getValue() > 80)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(highScorers);




    }
}
