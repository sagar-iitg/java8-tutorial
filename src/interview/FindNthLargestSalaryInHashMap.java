package interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNthLargestSalaryInHashMap {


    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("sagar",12000);
        map.put("anil",12000);
        map.put("tom",300000);
        map.put("amit",300000);
        map.put("sita",300000);
        map.put("ravan",700000);
        map.put("laxman",700000);
        map.put("ram",700000);
        map.put("ramesh",10000000);


        Map<Integer, List<Map.Entry<String, Integer>>> collect = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue));

        Map.Entry<Integer, List<String>> nthHighestSalaryWithDuplicate = getNthHighestSalaryWithDuplicate(2, map);
        System.out.println(nthHighestSalaryWithDuplicate);



        Map.Entry<String, Integer> nthHighestSalary = getNthHighestSalary(2, map);
        System.out.println(nthHighestSalary);


    }


    public static Map.Entry<String,Integer> getNthHighestSalary(int num,Map<String,Integer>  map)
    {
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                collect(Collectors.toList()).get(num-1);
    }


    public static Map.Entry<Integer, List<String>> getNthHighestSalaryWithDuplicate(int num,Map<String,Integer>  map)
    {
       return    map.entrySet().stream()
            .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
            .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num-1);

    }

}
