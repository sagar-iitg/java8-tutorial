package predicate;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Number> {

    @Override
    public boolean test(Number number) {
        if(number instanceof Integer)
            return true;
        return false;
    }

    public static void main(String[] args) {
        PredicateDemo p=new PredicateDemo();
        System.out.println(p.test(100));
        System.out.println(p.test(10.0));
        System.out.println(p.test((int) 'a'));

    }
}
