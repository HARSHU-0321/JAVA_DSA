package day8.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int j=1 ; j<=t ; j++){
        int n=sc.nextInt();
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            int sub=sc.nextInt();
            arr.add(sub);
        }
        int sum=0;
        for(int c:arr){
            sum +=c;
        }
        double avg=(double)sum/n;
        System.out.println("average of Student "+j+" is "+avg);

    }
    }
}
