package string.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Collections.nCopies(5, "sk"));
        System.out.println(list);
        List<Integer> obj = new ArrayList<>(Collections.nCopies(5, 0));
        System.out.println(obj);
        List<Integer> obj1 = new ArrayList<>(10);
        System.out.println(obj1);
    }
}
