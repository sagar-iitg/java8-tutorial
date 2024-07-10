package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemoLambda {

    public static void main(String[] args) {

        Supplier<String> s=()->"Hello World";
        System.out.println(s.get());


        List<String> list= Arrays.asList();

        System.out.println(list.stream().findAny().orElseGet(s));

    }
}
