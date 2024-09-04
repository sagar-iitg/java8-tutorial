package flatmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        Map<String, List<String >> people=new HashMap<>();


        people.put("john",List.of("22333","484848"));
        people.put("mary",List.of("9400","093884"));
        people.put("stece",List.of("58757","44"));
        people.put("biden",List.of("47474","487474"));
        people.put("putin",List.of("98474","1234"));

        List<String> list = people.values().stream().flatMap(Collection::stream).toList();
        System.out.println(list);
    }
}
