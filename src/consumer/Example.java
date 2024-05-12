package consumer;

import java.util.List;
import java.util.function.Consumer;

public class Example {


    public static void main(String[] args) {
        List<String> friendsName=List.of("mohit","ankit","ujjwal","aman","pankaj","amit");

        // verbose code
        friendsName.forEach(new Consumer<String>() {
            @Override
            public void accept(final String name) {
                System.out.print(name+" ");

            }
        });

    }
}
