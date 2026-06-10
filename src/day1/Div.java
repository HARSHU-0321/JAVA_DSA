package day1;
import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("zip zap");
        }
        else if (a%5==0) {
        System.out.println("zap");
        }
        else if(a%3==0){
            System.out.println("zip");
        }
        else{
            System.out.println("not valid");
        }
    }
}
