package epam;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
        String s = "dabfcadef";
        String[] split = s.split("");
        char[] charArray = s.toCharArray();
        System.out.println(charArray);
        System.out.println(Arrays.toString(split));
    }
}
