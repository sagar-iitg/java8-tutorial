package example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = List.of("one", "two", "three", "four","one");

        // Use streams to create a map with strings as keys and their lengths as values
        Map<String, Integer> map = strings.stream()
                .collect(Collectors.toMap(
                        str -> str,           // Key mapper: Keep the original string as the key
                        String::length,     // Value mapper: Get the length of each string
                       (existingValue, newValue) -> newValue // Merge function: Keep the new value
                ));


        System.out.println( map);
    }
}

