package lambda;



interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

public class Example1 {

    public static void main(String[] args) {

        Formula formula=new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
    }

}



