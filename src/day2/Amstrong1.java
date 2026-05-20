package day2;

import java.util.Scanner;

public class Amstrong1 {
    public static boolean solution(int num){
        // get count of digits
        int temp=num;
        int count=0;

        while(temp !=0 )
        {
            count++;
            temp = temp/10;
        }
        //calculate consigutive  sum  of all digits with i
        temp=num;
        double result=0;
        while(temp !=0){
            int digit=temp%10;
            result=result+Math.pow(digit,count); //java.lang
            temp=temp/10;
    }
         System.out.println(result+" "+num);
        return result==num;       
    }
        //  checkin for equalant of
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        // if(solution(num)){
        //     System.out.println("this is a Armstrong number");
        // }else{
        //     System.out.println("this is not a Armstrong number");
        // }
        for (int i = 1; i <=num;i++) {
            if(solution(i)){
                System.out.println(i+" ");
            }
            
        }
        System.out.println();
    }
}
