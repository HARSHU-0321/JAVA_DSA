package day7;

import java.util.Scanner;

public class UniqueValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // t-no.of test cases
        int t=sc.nextInt();
        for (int j = 0; j < t; j++) {
            
            int n=sc.nextInt();
            int arr[]= new int[n];
            int s=0;

        //imput of array values
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         //calculater the XOR 
         for(int i=0;i<n;i++){
            s=s^arr[i];
        }
        System.out.println(s);

        }
        sc.close();
        
    }
}
