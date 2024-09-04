package max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExampleInteger {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,40,5,6,7,8,9,10);
        int max = list.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(max);


        Optional<Integer> max1 = list.stream().max(Comparator.comparing(Integer::valueOf));
        if(max1.isPresent()){
            System.out.println(max1.get());
        }


        int max2 = list.stream().max(Comparator.comparing(Integer::valueOf)).orElse(25);
        System.out.println(max2);

    }
}
