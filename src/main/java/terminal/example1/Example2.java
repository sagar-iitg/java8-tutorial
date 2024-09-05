package terminal.example1;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

        Integer ans = numbers.stream().filter(e -> e > 10).findFirst().orElse(-1);
        System.out.println(ans);

    }
}
