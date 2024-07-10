package stream.api;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        char[] ch = {'a', 'b','b' ,'c', 'd', 'a', 'a', '2', '3'};
        Map<Character, Long> map = IntStream.range(0, ch.length).
                mapToObj(i -> ch[i]).
                collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(map);
        map.forEach( (key,value)->System.out.println(key+"- "+value));

        List<Character>  collect = map.entrySet().
                stream().filter(i -> i.getValue() > 1).
                map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(collect);

    }


}
