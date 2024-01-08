package example;

import java.util.Arrays;
import java.util.List;

public class Example1 {




    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                //method references
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        int[] arr={1,2,3,4,5};
        int sumResult=Arrays.stream(arr).filter(n->n%2==0).sum();
        System.out.println(sumResult);





    }
}
