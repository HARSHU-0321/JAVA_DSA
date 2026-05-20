package day2;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        int n,m,rev,rem;
        rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();
        //loop

        while(n>0){
            m=n;
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println("Reverse of  is "+rev);
        
    }
}
//54321