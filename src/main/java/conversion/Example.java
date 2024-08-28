package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list1);
    }
}
