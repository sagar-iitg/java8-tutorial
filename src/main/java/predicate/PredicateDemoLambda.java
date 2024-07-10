package predicate;

import java.util.function.Predicate;

public class PredicateDemoLambda {

    public static void main(String[] args) {

        Predicate<Integer> p=(number)-> {
            if(number instanceof Number)
                return true;
            return false;
        };
        System.out.println(p.test(10));



    }
}
