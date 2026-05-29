package day10;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
            for(int i=0 ; i<n-1 ; i++){
                for(int j=0 ; j< n-i-1 ; j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
/*
for giving input in program
public static void main(String[] args) {
        int arr[]={13,52,1,4};
        int n=arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j< n-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        System.out.println(Arrays.toString(arr));

        }

    }
*/
