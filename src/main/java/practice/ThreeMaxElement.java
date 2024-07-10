package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeMaxElement {
    public static void main(String[] args) {
        int[] arr={10,-2,-3,4,5,78};

        Collection<Integer> max = Arrays.stream(arr).
                boxed().sorted((a,b)->b-a).limit(3).
                collect(Collectors.toList());
        System.out.println(max);

        Collection<Integer> min = Arrays.stream(arr).
                boxed().sorted().limit(3).
                collect(Collectors.toList());

        System.out.println(min);
    }
}
