package streams.practice;

import java.util.stream.Stream;

public class FibonacciStreamExample {
    public static void main(String[] args) {
        // Generate Fibonacci sequence
        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
              .limit(10) // Limit to 10 numbers
              .map(fib -> fib[0]) // Map to the first element of each pair
              .forEach(System.out::println); // Print the Fibonacci numbers
    }
}