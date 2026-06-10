package day1;

import java.util.Scanner;

public class Operator {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter values");
         int a=sc.nextInt();
         int b=sc.nextInt();
         char op=sc.next().charAt(0);

         switch (op) {
             case '+':
                 System.out.println("sum is "+(a+b));
                 break;
             case '-':
                System.out.println("sub is "+(a-b));
                 break;
                 case '*':
                System.out.println("mul is "+(a*b));
                 break;
                 case '%':
                System.out.println("div is "+(a%b));
                 break;
             default:
                System.out.println("invalid");
         }
     }
}
/*
writje a prog that takes 2 operends and 1 operator form user 
,perform the operation and preint result using switch stmt
*/
