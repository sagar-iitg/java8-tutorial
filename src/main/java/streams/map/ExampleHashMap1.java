package streams.map;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleHashMap1 {

    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();

        map.put('z',0);
        map.put('b',56);
        map.put('p',56);
        map.put('q',56);
        map.put('w',0);
        map.put('f',0);
        map.put('c',-1);
        map.put('x',44);
        map.put('a',10);
        map.put('y',0);
        map.put('o',10);
        map.put('@',10);

        LinkedHashMap<Character, Integer> ans = map
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(
                        Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));


        System.out.println(ans);

    }
}
