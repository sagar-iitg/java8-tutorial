package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementInList {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,21,3,4,1,21,0,9,7,8,21);
        Map<Integer, Long> freq = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freq);

        List<Integer> collect = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).
                collect(Collectors.toList());
        System.out.println(collect);
    }
}
