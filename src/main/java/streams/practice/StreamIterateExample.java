package streams.practice;

import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        // Generate a stream of even numbers starting from 0
        Stream.iterate(0, n -> n + 1)
              .limit(10) // Limit to 10 numbers
              .forEach(System.out::println); // Print each number
    }
}