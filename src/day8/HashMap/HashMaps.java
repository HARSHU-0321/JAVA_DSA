package day8.HashMap;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ravi",8);
        map.put("Rama",3);
        map.put("Ramu",2);
        map.put("Raki",4);
        // System.out.println(map);
        for(String c:map.keySet())
        {
            System.out.println(c+":"+map.get(c));
        }
        

    }
}
