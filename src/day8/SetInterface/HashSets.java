package day8.SetInterface;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSets {
    public static void main(String[] args) {

        // HAshSet To LinkedList
        
        HashSet<Integer> set = new HashSet<>(); 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        LinkedList<Integer> s= new LinkedList<>(set);
        System.out.println(s);
    }
}
