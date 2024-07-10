package interview;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<String> list=List.of("sagar","kumar","kell","Koeei");

        List<String> ans = list.stream().
                map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).
                toList();

        System.out.println(ans);
    }
}
