package primitive.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Example {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int max = Arrays.stream(arr).max().orElse(-1);
        System.out.println(max);
        Integer[] nums={1,2,3,4,5,6};
        Integer max1 = Arrays.stream(nums).max(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println(max1);

    }
}
