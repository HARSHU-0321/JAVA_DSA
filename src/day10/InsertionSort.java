package day10;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //t no.of test cases
        int t=sc.nextInt();
        for(int k=0; k<t;k++){
            int n=sc.nextInt();
            int[] arr= new int[n];

            //to input array values
            for(int i=0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
            //to sort
            for(int i=0 ; i<n ; i++){
                 int j=i-1;
                    int cur=arr[i];
                    while(j>=0 && arr[j] > cur){  //checking where we need to insert element
                        arr[j+1]=arr[j];
                        j--;
                    }
                    arr[j+1]=cur;  //placing element
                }
                System.out.println(Arrays.toString(arr));
        }
        
    }
}
