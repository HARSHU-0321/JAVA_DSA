package day3;

import java.util.Arrays;

public class LesftByOne {

    //TC:O(n)

    public static void solution(int[] arr) {
        int size=arr.length;


        //step 1:
        int temp=arr[0];

        //step2:
        for (int i = 1; i < size; i++) {
            arr[i-1]=arr[i];
        }

        //step 3
        arr[size-1]=temp;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        solution(arr);

        System.out.println(Arrays.toString(arr));
        

    }
}
