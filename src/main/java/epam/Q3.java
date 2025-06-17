package epam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Q3 {
    public static void main(String[] args) {
        String s = "I am interested123455 to grow in my organization";
        String s1="";
        String str= Arrays.stream(s.split(" ")).
                sorted(Comparator.comparing(String::length).reversed()).skip(1).
                findFirst().orElse("not found");
        System.out.println(str);
    }
}
