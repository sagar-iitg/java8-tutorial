package streams;
import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = Map.of(
                "a", List.of(1, 2),
                "b", List.of(3, 4)
        );
        System.out.println(map);
        List<Integer> list = map.values().stream().flatMap(List::stream).toList();
        System.out.println(list);


    }
}
