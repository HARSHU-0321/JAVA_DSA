package day2;

import java.util.Scanner;

public class Amstrong {
    
    public static void main(String[] args) {
        
        int n,m,rem,sum;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();
        //loop
        m=n;
        sum=0;

        while(n>0){
            
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==m){
        System.out.println("amstrong of  is "+sum);
        }
    }
}

/*
num=153;
temp=num;
count=0;
whilr(temp){
count++;
temp=num/10;
}
*/

/*
int num=153;
int temp=num;
int result=0;
while(temp){
digit=temp%10;
result=result+MathPow(digit,count); //java.lang
temp=num/10;
}
return result==num;
*/