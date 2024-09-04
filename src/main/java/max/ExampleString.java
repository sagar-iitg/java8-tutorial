package max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExampleString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("sagar","Putin","Biden","Modi","Trump");
        String maxString = list.stream().max(Comparator.comparing(String::valueOf)).get();
        System.out.println(maxString);

        String minString = list.stream().min(Comparator.comparing(String::valueOf)).get();
        System.out.println(minString);
    }
}
