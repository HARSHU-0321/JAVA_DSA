package day6;

import day6.Test1;

public class DataHiding {
    
    public static void main(String[] args) {
        Test1 t=new Test1();

        t.setA(10);

        t.printA();

        System.out.println(t.d);
    }
}
