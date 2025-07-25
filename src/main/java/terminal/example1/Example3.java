package terminal.example1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("", "  ", "Java", "Stream", "API");

        Optional<String> firstNonEmpty = words.stream()
                .filter(word -> !word.isEmpty())
                .findFirst();
        System.out.println(firstNonEmpty.isEmpty());

        firstNonEmpty.ifPresent(word ->
                System.out.println("First non-empty string: " + word));
        System.out.println(firstNonEmpty.isPresent());
       firstNonEmpty.ifPresent(System.out::println);
    }
}
