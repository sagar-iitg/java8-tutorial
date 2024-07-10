package example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = List.of("one", "two", "three", "four");

        // Use streams to group the strings by their length and count the occurrences of strings of each length
        Map<Integer, List<String>> map = strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toList()));

        System.out.println(map);

    }
}
