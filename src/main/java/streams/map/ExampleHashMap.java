package streams.map;

import java.util.*;

public class ExampleHashMap {

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

        List<Map.Entry<Character,Integer>> list=
                new ArrayList<>(map.entrySet());

        System.out.println(list);

        list.sort(Map.Entry.comparingByKey());
        System.out.println(list);

        LinkedHashMap<Character,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry:list)
        {
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(sortedMap);


    }
}
