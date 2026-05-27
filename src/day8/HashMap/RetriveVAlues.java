package day8.HashMap;

import java.util.HashMap;

public class RetriveVAlues {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ravi",89);
        map.put("Rama",99);
        map.put("Ramu",99);
        map.put("Raki",99);
        // System.out.println(map);
        for(String c:map.keySet())
        {
            if(map.get(c)==99){
                System.out.println(c);
            }
        }
        

    }
}
