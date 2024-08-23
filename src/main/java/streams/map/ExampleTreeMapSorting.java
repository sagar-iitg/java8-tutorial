package streams.map;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleTreeMapSorting {

    public static void main(String[] args) {

        Map<Character,Integer> map=new TreeMap<>();
        map.put('a',100);
        map.put('b',1);
        map.put('c',-987);
        map.put('d',45);

        LinkedHashMap<Character, Integer> sortByValue = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        System.out.println(sortByValue);


        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.sort(Comparator.comparing(Map.Entry::getValue));
        LinkedHashMap<Character,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(sortedMap);



    }
}
