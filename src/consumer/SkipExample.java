package consumer;

import java.util.List;

public class SkipExample {

    public static void main(String[] args) {
        List<String> names=List.of("shadan","chirag","asif11","arshdeep","harimohan","akshay","pankaj");
        //names.stream().skip(3).forEach(x->System.out.print(x+" "));
        names.stream().dropWhile(n->n.length()>4).forEach(x->System.out.print(x+" "));
    }
}
