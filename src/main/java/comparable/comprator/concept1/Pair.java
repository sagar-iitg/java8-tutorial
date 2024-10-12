package comparable.comprator.concept1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pair {

    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return
               "(" + x +","+
                 y +")";

    }

    public static void main(String[] args) {

        Pair p4=new Pair(3,5);
        Pair p5=new Pair(3,6);
        Pair p6=new Pair(1,5);
        Pair p1=new Pair(1,2);
        Pair p2=new Pair(2,5);
        Pair p3=new Pair(3,1);
        Pair p7=new Pair(3,-1);


        List<Pair> list= new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6,p7));
        list.sort(Comparator.comparing(Pair::getY).reversed());
        System.out.println(list);


    }

}


