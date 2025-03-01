package string.format;

public class Example {
    public static void main(String[] args) {
        int num = 42;
        String result = String.format("%d", num);
        System.out.println(result);
        int m = 5;
        System.out.println(String.format("%03d", m));
        double pi = 3.14159265359;
        System.out.println(String.format("%.4f", pi)); // Output: Pi: 3.14



    }
}
