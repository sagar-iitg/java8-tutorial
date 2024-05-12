package example;

import java.util.List;

public  class LimitExample {

        public static void main(String[] args) {
            List<String> names=List.of("shadan","chirag","asif11","arshdeep","harimohan","akshay","pankaj");
            names.stream().limit(3).forEach(x->System.out.print(x+" "));

        }
    }