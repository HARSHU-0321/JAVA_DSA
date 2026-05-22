package day5;

public class Recursion {
    public static void func(int n){

       // ''base case

       if(n==0)return;

       //System.out.print(n+" "); // to get 5 4 3  2 1
       
       //recursive class

       func(n-1);

       System.out.print(n+" "); // 1 2 3 4 5

    }
    public static void main(String[] args) {
        func(5);
    }
}
