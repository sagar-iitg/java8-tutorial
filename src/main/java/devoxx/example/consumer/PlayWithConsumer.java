package devoxx.example.consumer;

import java.util.function.Consumer;

public class PlayWithConsumer {

    public static void main(String[] args) {

        //return type-void || takes one argument
        Consumer<String> consumer= (String s) ->{
            s=s+" "+s;
            System.out.println(s);
        };

        consumer.accept("Hello Devoxx");
    }
}
