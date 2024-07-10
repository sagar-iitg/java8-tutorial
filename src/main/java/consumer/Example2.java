package consumer;

import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        final List<String> friendsName=List.of("mohit","ankit","ujjwal","aman","pankaj","amit","Nitin");

        List<String> startWithN = friendsName.stream().
                filter(n -> n.startsWith("N") || n.startsWith("a")).
                collect(Collectors.toList());

        System.out.println(startWithN);


    }
}
