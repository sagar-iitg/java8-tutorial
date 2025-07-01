package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);

        List<Integer> ages = List.of(12, 17, 18, 20, 25);

        Map<Boolean, List<Integer>> collect = ages.
                stream().
                collect(Collectors.partitioningBy(age -> age > 18));
        System.out.println(collect);

    }
}
