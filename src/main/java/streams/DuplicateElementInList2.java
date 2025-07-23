package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementInList2 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,21,3,4,1,21,0,9,7,8,21);


        //List<Integer> [1,21]
        //Map<Integer,Long> 1-2,
        //Function.iden
        Map<Integer, Long> map = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


        //return type
        //predicate (boolean),function(return type),supplier (return type),consumer(void)

         //{1=2,21=3}
        //declarative
        //what to do
        List<Integer> list1 = map.entrySet().stream().filter(e -> e.getValue() > 1).
                map(Map.Entry::getKey).toList();
        System.out.println(list1);


    }
}
