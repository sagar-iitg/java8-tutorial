package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemoLambda {

    public static void main(String[] args) {
        Consumer<Integer> c=(t)-> System.out.println(t);
        c.accept(10);
        System.out.println("-------------------");
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().forEach(c);
        System.out.println("-----------");
        list.stream().forEach(t->System.out.println(t));
        System.out.println("--------------");
        list.stream().forEach(System.out::println);



    }
}
