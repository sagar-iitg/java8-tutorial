package functional.Interface;


interface  Calculator{
    int sub(int a,int b);


}
public class CalculatorAddImpl {

    public static void main(String[] args) {

        Calculator c=(a,b)->{

            if(a<b)
            {
                throw new RuntimeException("first argument should be greater then 2nd argument");
            }
            else{
                return a-b;
            }

        };

        System.out.println( c.sub(3,1));

    }
}
