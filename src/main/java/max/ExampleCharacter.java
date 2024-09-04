package max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExampleCharacter {

    public static void main(String[] args) {
        List<Character> list= Arrays.asList('a','b','c','d','e');
        char maxChar = list.stream().max(Comparator.comparing(Character::charValue)).get();
        System.out.println(maxChar);
    }
}
