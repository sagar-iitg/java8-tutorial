package epam.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        String s="sagar";
        Object[] array = s.chars().distinct().mapToObj(c -> (char) c).toArray();
        System.out.println(Arrays.toString(array));


    }
}
