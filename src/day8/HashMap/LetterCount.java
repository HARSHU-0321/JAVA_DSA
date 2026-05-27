package day8.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LetterCount {
    public static void main(String[] args) {
        String s="Programming";
        /*  string to char
        char c[]= s.toCharArray();
        System.out.println(c.toString());
        */
       HashMap<Character,Integer> map = new HashMap<>();
       for(char c:s.toCharArray())
       {
        //count characters
        if(map.containsKey(c))
        {
            map.put(c, map.get(c)+1);
        }else{
            map.put(c, 1);
        }
       }
       System.out.println(map);

       //to find duplicate values
       HashSet<Character> res = new HashSet<>();
       for(char c:s.toCharArray())
       {
        if(map.get(c)>1 )
        {
            res.add(c);
            
        }
       }
        System.err.println(res);
        
    }
}
