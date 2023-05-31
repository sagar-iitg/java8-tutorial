package functional.Interface;

public interface MyFunctionalInterface {


    void m1();

    default  void m2(){
        System.out.println("Default method m2 -- from MyFunctionalInterface");
    }
    static void m4(){

        System.out.println("static method m4 -- from MyFunctionalInterface");
    }


}
