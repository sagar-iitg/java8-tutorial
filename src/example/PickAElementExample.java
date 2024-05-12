package example;

import java.util.List;

public class PickAElementExample {
    public static void main(String[] args) {
        List<String> names=List.of("sagar","kumar","ankit","mohit");
        int totalCharacter = names.stream().mapToInt(String::length).sum();
        System.out.println(totalCharacter);
    }
}
