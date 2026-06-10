package day1;
import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
 
        Scanner sc=new Scanner(System.in);
        System.out.println(" a value");
        int a=sc.nextInt();
        System.out.println(" b value");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" a is: "+a);
        System.out.println(" b is: "+b);  
        sc.close(); 
    }
}
