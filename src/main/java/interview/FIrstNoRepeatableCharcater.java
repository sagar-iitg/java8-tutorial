package interview;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIrstNoRepeatableCharcater {

    public static void main(String[] args) {
        String s="abacdeb";

        List<Character> l1=new ArrayList<>();
        Map<Character,Long> countMap=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            l1.add(s.charAt(i));
        }

        countMap=l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);
    }
}
