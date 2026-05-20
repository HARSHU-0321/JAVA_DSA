package day2.Array;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
			//System.out.println("enter size of array:");
			//int n=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			System.out.println("enter element of "+"a["+i+"] :");

		        a[i]=sc.nextInt();
  
		}
		for(int i=0;i<5;i++)
		{
			//System.out.println("elements in array:");
			System.out.println("element in array "+"a["+i+"]  is :"+a[i] );
		}
		for(int i=0;i<5;i++)
		{
			if(i/2==0){
				System.out.println();
				System.out.print("The odd position in array are ");
				System.out.print("a["+i+"]"+" ");
			}
		}
		for(int i=0;i<5;i++)
		{
			if(i/2==1){
				System.out.println();
				System.out.print("The even position in array are ");
				System.out.print("a["+i+"]"+" ");
			}
		}			
}
    
}
