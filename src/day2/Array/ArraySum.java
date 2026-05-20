package day2.Array;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
			//System.out.println("enter size of array:");
			//int n=sc.nextInt();
		for(int i=0;i<5;i++)
		{
		    arr[i]=sc.nextInt();
  
		}
        int sum=0; 
        for(int i=0;i<5;i++)
         {
       sum=sum+arr[i];
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
       
 }
   
}
