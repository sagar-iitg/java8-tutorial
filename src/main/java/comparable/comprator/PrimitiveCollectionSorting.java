package comparable.comprator;

import java.util.Arrays;
import java.util.Collections;

public class PrimitiveCollectionSorting {

    public static void main(String[] args) {
        int[] arr={1,2,34,-9,0,4};
        float[] floatArr={1.1f,2.1f,0.1f,-1.3f};
        Arrays.sort(arr);
        Arrays.sort(floatArr);
        System.out.println(Arrays.toString(floatArr));

    }
}
