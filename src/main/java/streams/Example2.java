package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        List<String> top2 = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(top2);

    }
}
