package stream.api.sort;

import java.util.*;

public class SortingList {


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        // System.out.println(list);

        list.add("docker");
        list.add("mac");
        list.add("win");
        list.add("ubuntu");
        list.add("rhel");

        // this method acts as bridge between array-based and collection-based APIs,
//        List<String> names= Arrays.asList("sagar","ankit","mohit","kaushik","pankaj","nitin");
//
//        Collections.sort(names,Collections.reverseOrder());
//
//        System.out.println(names);
      //  Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        list.stream().sorted().forEach(t-> System.out.print(t+" "));




    }
}
