package stream.api;

import java.util.ArrayList;
import java.util.List;

public class ForEach {


    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

       // System.out.println(list);

        list.add("docker");
        list.add(null);
        list.add("mac");
        list.add("win");
        list.add("ubuntu");
        list.add("rhel");

        list.forEach(System.out::println);
        System.out.println("--------------");
        list.stream().forEach(System.out::println);


    }



}
