package epam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        String s = "I am interested123455 to grow in my organization i";

        Map<String, Long> collect = Arrays.stream(s.trim().toLowerCase().split("\\s+")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        String s2="abccddeef";

        long count = s2.chars()
                .distinct()
                .count();
        System.out.println(count);




    }
}
