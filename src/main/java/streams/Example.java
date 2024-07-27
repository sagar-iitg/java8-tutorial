package streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        Supplier<String> supplier=new Supplier<String>() {
            @Override
            public String get() {
                return "Hello Stream";
            }
        };
        Stream<String> streamOfStrings=Stream.generate(supplier);
        System.out.println(streamOfStrings);


    }
}
