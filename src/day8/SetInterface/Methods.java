package day8.SetInterface;

import java.util.HashSet;

public class Methods {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);   
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(4);
        s2.add(5);  
        //store common elements in s1
        s1.retainAll(s2);
        System.out.println(s1);
        //remove duplicate values "Union"
        s1.addAll(s2);
        System.out.println(s1);
        //compare Lists
        System.out.println(s1.containsAll(s2));
    }
    
}
