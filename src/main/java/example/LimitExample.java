package example;

import java.util.List;

public  class LimitExample {

        public static void main(String[] args) {
            List<String> names=List.of("shadan","chirag","asif","arshdeep","harimohan","akshay","pankaj");
            names.stream().limit(3).forEach(x->System.out.print(x+" "));
            System.out.println();
            names.stream().limit(3).map(String::toUpperCase).forEach(System.out::println);

        }
    }