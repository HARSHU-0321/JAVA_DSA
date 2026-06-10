package day1;

import java.util.Scanner;

public class LeapYear {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
/* 365 days        6hours            32.45  
                   *4                 *400
                   24h                  24h
    !*100 like
        1000
        2000
*/
        if(year%4==0 && year % 100 !=0  || year % 400 == 0 ){
            System.out.println("Leap year:"+year);
        }
        else{
            System.out.println("not a Leap year:"+year);
        }
     }
}
