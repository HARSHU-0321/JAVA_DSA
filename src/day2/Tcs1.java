package day2;

import java.util.Scanner;

public class Tcs1 {
    public static void main(String[] args) {
        
        int m,code,rem;
        code=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        //loop

        while(n>0){
            rem=n%10;
            code=code*rem;
            n=n/10;
        }
        System.out.println(code);
    }
}
//543215244
/*
a supermarket maintains a pricing formate for all its producte, a value N is
 printed on each product.when the scanner read the value
 digits in the alue N is the price of the item.
 The task here is to design th software such that give the code of any item N
 should b e computed(price)
 input:
 5244
 output:
 160
 Explaination:
 5*2*4*4=160

*/