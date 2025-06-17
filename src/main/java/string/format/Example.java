package string.format;

public class Example {
    public static void main(String[] args) {
        int num = 42;
        String result = String.format("%d", num);
        System.out.println(result);
        int m = 5;
        System.out.printf("%03d%n", m);
        double pi = 3.14159265359;
        System.out.printf("%.4f%n", pi); // Output: Pi: 3.14



    }
}
