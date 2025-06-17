package epam;

import java.util.Arrays;

public class LongestWordLengthFinder {

    public static int findLongestWordLength(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        return Arrays.stream(sentence.trim().split("\\s+"))
                     .mapToInt(String::length)
                     .max()
                     .orElse(0);
    }

    public static void main(String[] args) {
        String sentence = "Java Streams are extremely powerful and flexible";
        int maxLength = findLongestWordLength(sentence);
        System.out.println("Length of longest word: " + maxLength); // Output: 9
    }
}
