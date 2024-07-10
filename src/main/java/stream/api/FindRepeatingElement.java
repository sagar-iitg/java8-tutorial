package stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class FindRepeatingElement {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 4, 6, 6, 9, 10};


        Map<Integer, Long> collect = Arrays.stream(array).
                boxed().
                collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);

        List<Integer> collect1 = Arrays.stream(array).
                boxed().
                collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect1);


        // Find and print duplicates
        List<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicates: " + duplicates);  // Output: Duplicates: [4, 6]
    }

    public static List<Integer> findDuplicates(int[] array) {
        return Arrays.stream(array)                     // Convert array to stream
                .boxed()                                // Box each int to Integer
                .collect(Collectors.groupingBy(         // Group by each element
                        e -> e, Collectors.counting())) // Count the occurrences
                .entrySet().stream()                    // Convert map to stream
                .filter(entry -> entry.getValue() > 1)  // Filter entries with count > 1
                .map(Map.Entry::getKey)                 // Get the keys (duplicate elements)
                .collect(Collectors.toList());          // Collect keys to a list
    }
}
