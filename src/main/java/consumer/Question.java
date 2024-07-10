package consumer;

import java.util.*;


public class Question {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);
        System.out.println("ans" + n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static int removeDuplicates(int arr[], int n) {
        //1,2,2,3,4,4,4,5,5

        for(int i=0;i<arr.length;i++){
            if(i>=0 && i+1< arr.length &&  arr[i]!=arr[i+1]){
               continue;
            }
            else if(i>=0 && i+1< arr.length && arr[i]==arr[i+1]){
                arr[i+1]=-1;
            }
        }

        System.out.println(Arrays.toString(arr));
        return  0;
    }
}






