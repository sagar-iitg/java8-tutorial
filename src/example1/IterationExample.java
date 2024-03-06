package example1;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterationExample {
    public static void main(String[] args) {


        final List<String> friends= Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott");

        System.out.println("-------------way1----------------");
        for(int i=0;i<friends.size();i++){
            System.out.println(friends.get(i));
        }
        System.out.println("-------------way2----------------");
        for (String name:friends) {
            System.out.println(name);
        }
        System.out.println("-------------way3----------------");

        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-------------way4----------------");
        friends.forEach((String name)-> System.out.println(name));

        System.out.println("-------------way5----------------");
        friends.forEach((name)-> System.out.println(name));

        System.out.println("-------------way6----------------");
        friends.forEach(n-> System.out.println(n));

        System.out.println("-------------way7----------------");
        friends.forEach(System.out::println);










    }
}
