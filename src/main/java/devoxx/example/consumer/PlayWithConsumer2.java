package devoxx.example.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PlayWithConsumer2 {

    public static void main(String[] args) {
        Consumer<List<String>> consumer=null;
        List<String> list=new ArrayList<>(Arrays.asList("a","b","c"));

        consumer.accept(list);
    }
}
