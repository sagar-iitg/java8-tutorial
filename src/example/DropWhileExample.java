package example;

import java.util.List;

public static class DropWhileExample {

        public static void main(String[] args) {
            List<String> names=List.of("shadan","chirag","asif11","arshdeep","harimohan","akshay","pankaj");
            names.stream().dropWhile(n->n.length()>4).forEach(x->System.out.print(x+" "));
        }
    }