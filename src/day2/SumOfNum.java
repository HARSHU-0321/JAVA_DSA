package day2;
import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();

        for (int i = 1; i<=n; i++) {
            sum=sum+i;
            
        }
        System.out.println("Sum  is:"+sum);
        sc.close();
    }
}
