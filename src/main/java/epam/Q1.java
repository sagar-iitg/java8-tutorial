package epam;


//
//
//1) Remove duplicates from string and return in same order".
//
//String s = "dabfcadef"; -> dabfce

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        String s = "dabfcadef"; // dabfce
        List<Character> collect = s.chars().distinct().mapToObj(c -> (char) c).toList();
        System.out.println(collect);

        List<String> collect1 = Arrays.stream(s.split("")).distinct().toList();
        System.out.println(collect1);

        String collect2 = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
        long count = Arrays.stream(s.split("")).distinct().count();
        System.out.println(count);


        System.out.println(collect2);


    }
}
