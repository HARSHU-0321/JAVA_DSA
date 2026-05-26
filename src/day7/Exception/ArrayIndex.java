package day7.Exception;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        try {
            int i=sc.nextInt();
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index not valid");
        }
    }
}
