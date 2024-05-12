package consumer;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<String> friendsName=List.of("mohit","ankit","ujjwal","aman","pankaj","amit");

        List<String> uppercaseNames =new ArrayList<>();
        //such code should be avoided
        //shared mutability
        friendsName.forEach(name->uppercaseNames.add(name.toUpperCase())); //BAD IDEA
        System.out.println(uppercaseNames);
        System.out.println(friendsName);

        //The map method of the Stream interface can help us avoid mutability
        

    }
}
