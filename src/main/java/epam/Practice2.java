package epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice2 {

    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("sagar");
        str.add("sagar");
        str.add("sagar");
        str.add("shadan");
        str.add("shadan");
        str.add("shadan");
        str.add("ankit");

        Map<String, Integer> map = str.stream().
                collect(Collectors.groupingBy(
                        Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));
        System.out.println(map);

        String s="sagar";
        Map<Character, Integer> collect = s.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),
                        Collectors.reducing(0, e -> 1, Integer::sum)));
        System.out.println(collect);


    }
}
