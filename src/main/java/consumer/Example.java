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
        System.out.println("---------");
        //forEach is a higher-order function that accepts a lambda expression
        // or block of code to execute in the context of each element in the list.

        friendsName.forEach((final String name)-> System.out.println(name));
        System.out.println("---------");
        //Java compiler determines the name parameter is a String type,
        friendsName.forEach((name)-> System.out.println(name));

        //The Java compiler treats single-parameter lambda expressions as special:
        // we can leave off the parentheses around the parameter if the parameter’s type is inferred.
        // There’s one caveat: inferred parameters are non-final
        friendsName.forEach(name-> System.out.println(name));

        // super less code
        // we used a method reference
        friendsName.forEach(System.out::println);


    }
}
