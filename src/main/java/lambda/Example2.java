package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {


    public static void main(String[] args) {
        List<String> names= Arrays.asList("sagar","ankit","mohit","kaushik","pankaj","nitin");


        // Method I --Increaing Order

        //Collections.sort(names);

        //Method II -Decreaing Order
//        Collections.sort(names,Comparator.reverseOrder());

            //Method III
            // decreasing order sorting
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

        //Method 4 -> Increasing O
        // order Sorting

//        Collections.sort(names,(String a,String b)->{
//            return a.compareTo(b);
//        });

        //Method 5
        //Collections.sort(names,(String a,String b)->b.compareTo(a));


        //Method 6

        //names.sort((a,b)->b.compareTo(a));

        names.forEach(System.out::println);



    }
}
