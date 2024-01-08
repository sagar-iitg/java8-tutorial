package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        int[] arr={1,2,2,3,4,5,5};
        Map<Integer, Long> map = Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        String str="hello";
        Map<Character, Long> map1 = str
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println(map1);

    }
}
