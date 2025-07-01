package streams;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        int[] arr={1,2,3,4,5,6};
        int sum = list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        int sum1 = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();
        System.out.println(sum1);

    }
}
