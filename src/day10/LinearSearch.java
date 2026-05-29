package day10;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //t no.of test cases
        int t=sc.nextInt();
        for(int k=0; k<t;k++){
            int n=sc.nextInt();
            int[] arr= new int[n];
            int target = sc.nextInt(); //declare target

            //to input array values
            for(int i=0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int idx=0;
            for(int i=0 ; i<n ; i++){
                if(arr[i]==target){
                    idx=i;
                    break;
                }
            }
            if(idx==0){
                System.out.println("element not found");
            }else{
                System.out.println("element idx is "+idx);
            }
        }

        sc.close();
        
    }
}
