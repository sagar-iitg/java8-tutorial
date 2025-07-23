package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple","banana","banana");

        List<String> top2 = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))//apple-3, banana-2,orang-1
                .entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed()) //apple-3, banana-2,orang-1
                .limit(2)////apple-3, banana-2
                .map(Map.Entry::getKey)//apple,banana
                .collect(Collectors.toList());

        List<Map.Entry<String, Long>> list = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))//apple-3, banana-2,orang-1
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).toList();

        System.out.println(list);

        System.out.println(top2);

    }
}
