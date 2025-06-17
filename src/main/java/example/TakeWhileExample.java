package example;

import java.util.List;

public  class TakeWhileExample {
        public static void main(String[] args) {
            List<String> names=List.of("shadan","chirag","asif","arshdeep","harimohan","akshay","pankaj");
            System.out.println();
            //like break statement
            names.stream().takeWhile(name->name.length()>4).map(String::toUpperCase).forEach(System.out::println);

        }
    }