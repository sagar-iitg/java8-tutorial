package lambda.example2;


@FunctionalInterface
interface A{
    void funA();

}
@FunctionalInterface
interface B{

    void funB(String s);
}

@FunctionalInterface
interface C{
    int funC();
}


@FunctionalInterface
interface D{
    int funD(int x);
}

public class Main {

    public static void main(String[] args) {

//        A a=()->System.out.print("No arguments no return type -- lambda");
//        a.funA();

       // System.out.println("sagar kumar");

        A a=()->System.out.println("No arguments no return type -- lambda");
        a.funA();

        B b= (s) -> System.out.println(s);
        b.funB("arguments with no return type");

        C c=()->2;
        System.out.println(c.funC());

        D d=(i)->i*i;
        System.out.println(d.funD(4));








    }
}
