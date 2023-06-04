package stream.api;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {


    private static Map<Integer, String> map;

    public static void main(String[] args) {

        map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.forEach((key,value)-> System.out.println(key+" "+value));
        System.out.println("--------");
        System.out.println(map.entrySet());
        System.out.println("--------");
        map.entrySet().forEach(System.out::println);


    }
}
