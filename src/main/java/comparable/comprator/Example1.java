package comparable.comprator;

import java.util.Arrays;
import java.util.Collections;

public class Example1 {

    public static void main(String[] args) {
        Integer[] arr={1,10,-3,4,2,10};
        //Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr,(Integer val1,Integer val2)->val2-val1);

        Arrays.stream(arr).forEach(e->System.out.print(e+" "));

    }


}
