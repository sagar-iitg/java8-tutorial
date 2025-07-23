package optional;

import java.util.Optional;
import java.util.Properties;
import java.util.UUID;

public class Example {
    public static void main(String[] args) {
        Optional<Object> obj = Optional.ofNullable(null);
        System.out.println(obj.isEmpty());
       // System.out.println(obj.get());
        System.out.println(obj.orElse(-1));
        System.out.println(UUID.randomUUID());


    }
}
