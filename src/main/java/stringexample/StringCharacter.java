package stringexample;

import java.util.stream.IntStream;

public class StringCharacter {
    public static void main(String[] args) {

        final String str="ako90djjer0123";
        str.chars().forEach(System.out::println);
        IntStream chars = str.chars();
        System.out.println(chars.sum());

    }
}
