package day8.SetInterface;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        ArrayList<String> emd = new ArrayList<>();
        emd.add("ram");
        emd.add("ram");
        emd.add("sita");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }   
}
/*
ArrayList<String> emd = new ArrayList<>();
        emd.add("ram");
        emd.add("ram");
        emd.add("sita");
        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
*/
