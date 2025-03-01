package conversion;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListToIntArray {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
        list.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        list.add(new ArrayList<>(Arrays.asList(0, 1, 1, 0)));
        list.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        System.out.println(list);


        int[][] array = list.stream().
                map(row -> row.stream().mapToInt(x -> x).toArray()).
                toArray(int[][]::new);
        System.out.println(Arrays.deepToString(array));

    }
}
