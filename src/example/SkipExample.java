package example;

import java.util.List;

public static class SkipExample {

        public static void main(String[] args) {
            List<String> names=List.of("shadan","chirag","asif11","arshdeep","harimohan","akshay","pankaj");
            names.stream().skip(3).forEach(x->System.out.print(x+" "));

        }
    }