package example3;


interface Walkable{

    int walk(int steps);
}
public class Main {

    public static void main(String[] args) {

        Walkable walkable=x->2*x;
        System.out.println(walkable.walk(5));


    }
}
