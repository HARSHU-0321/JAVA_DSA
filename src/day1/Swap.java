

package day1;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
 int c;
        Scanner sc=new Scanner(System.in);
        System.out.println(" a value");
        int a=sc.nextInt();
        System.out.println(" b value");
        int b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println(" a is: "+a);
        System.out.println(" b is: "+b);   
    }
}
