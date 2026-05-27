package day8.TODO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();             //t no.of test cases
        
        for(int j=0 ; j<t ; j++){

            int size=sc.nextInt();      //ArrayList Size

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0 ; i < size ; i++) {

                int val=sc.nextInt();   
                arr.add(val);           //insert values
            }
            Collections.reverse(arr);
        
            System.out.println(arr);    
        }
    }  

}
