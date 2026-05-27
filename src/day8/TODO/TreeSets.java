package day8.TODO;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        LinkedList<Integer> set= new LinkedList<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        TreeSet<Integer> s = new TreeSet<>(set); 
        System.out.println(s);


    }
}
