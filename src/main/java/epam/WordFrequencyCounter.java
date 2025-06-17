package com.sagar.gs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static Map<String, Long> countWordOccurrences(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return Collections.emptyMap();
        }

        return Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        String sentence = "Java is great and Java is powerful";

        Map<String, Long> wordCountMap = countWordOccurrences(sentence);

        wordCountMap.forEach((word, count) ->
                System.out.println(word + " -> " + count)
        );
    }
}
