package streams;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {

        List<List<Integer>> numbers = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5)
        );

        List<Integer> list = numbers.stream().flatMap(List::stream).toList();
        System.out.println(list);


    }
}
