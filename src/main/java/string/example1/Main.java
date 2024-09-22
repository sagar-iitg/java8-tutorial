package string.example1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry", "date"};
        // Concatenate the strings with a custom separator using Stream.reduce
        String result = Arrays.stream(words)
                              .reduce((a, b) -> b + ", " + a)
                              .orElse("");
        System.out.println(result);



    }
}
