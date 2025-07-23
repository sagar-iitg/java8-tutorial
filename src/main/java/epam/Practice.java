package epam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("sagar");
        str.add("sagar");
        str.add("sagar");
        str.add("shadan");
        str.add("shadan");
        str.add("shadan");
        str.add("ankit");
        Map<String, Long> freqMap = str.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqMap);
        String s = freqMap.entrySet().stream().
                sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()).
                        thenComparing(Map.Entry.comparingByKey())).findFirst().
                map(Map.Entry::getKey).orElse(null);
        System.out.println(s);



    }
}
