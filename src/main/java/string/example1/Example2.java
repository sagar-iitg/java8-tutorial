package string.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example2 {
    public static void main(String[] args) {
        int n=4;
        List<List<String>> list = IntStream.range(0, n).
                mapToObj(i -> new ArrayList<>(Collections.nCopies(n, "."))).
                collect(Collectors.toList());
        System.out.println(list);
    }
}
