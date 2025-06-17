package epam;

import java.util.*;

/**
 * Problem Name: Longest Word in a Sentence
 *
 * Instructions:
 *  - Split the sentence by space.
 *  - Find and return the longest word.
 *  - In case of tie, return the first occurring word.
 *  - If the input string is empty or has no words, return an empty string.
 */

class LongestWordFinder {
    private static final Map<String, String> testCases = new LinkedHashMap<>();

    public static String longestWord(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("");
    }

    public static void main(String[] args) {
        // ✅ Test cases
        testCases.put("I am interested123455 to grow in my organization", "interested123455");
        testCases.put("Java Stream API is powerful", "powerful");
        testCases.put("one two three", "three");
        testCases.put("equal aaa bbb", "equal"); // first of length 5
        testCases.put("", "");
        testCases.put("     ", ""); // only spaces
        testCases.put("a ab abc abcd abcde", "abcde");
        testCases.put("short longest-word even-longer-word", "even-longer-word");

        boolean pass = true;
        for (Map.Entry<String, String> testCase : testCases.entrySet()) {
            String result = longestWord(testCase.getKey());
            if (!Objects.equals(result, testCase.getValue())) {
                System.out.printf("❌ Failed for input: \"%s\"%nExpected: %s, Got: %s%n", testCase.getKey(), testCase.getValue(), result);
                pass = false;
            }
        }

        if (pass) {
            System.out.println("✅ All tests passed!");
        } else {
            System.out.println("❗ At least one test failed.");
        }
    }
}
