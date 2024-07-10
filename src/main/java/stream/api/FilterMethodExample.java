package stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterMethodExample {


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("docker");
        list.add("mac");
        list.add("win");
        list.add("ubuntu");
        list.add("rhel");
        list.stream().filter(t->t.startsWith("r")).forEach(System.out::println);
        Map<Integer, String> map;
        map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.entrySet().stream().filter(t->t.getKey()%2!=0).forEach(System.out::println);


    }
}
