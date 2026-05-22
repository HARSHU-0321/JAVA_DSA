package day5;

public class CountVCDS {
    public static void solution(String s){
         s=s.toLowerCase();

         String vowels ="aeiou";
         String decimals="0123456789";
         String symbols="!@#$%^&*(){}[]";

         int v=0,c=0,d=0,sp=0;



    for(int i=0;i<s.length()-1;i++){

        char ch=s.charAt(i);
        if(vowels.contains(Character.toString(ch))){
            v++;
        }else if(decimals.contains(Character.toString(ch))){
            d++;
        }else if(symbols.contains(Character.toString(ch))){
            sp++;
        }else{
            c++;
        }

    }
    System.out.println("count of Vowels:"+v);
    System.out.println("count of Consonants:"+c);
    System.out.println("count of decimals:"+d);
    System.out.println("count of Symbols:"+s);
    }
    
    public static void main(String[] args) {
        String s="aeioustrng123@#";
        
        System.out.println(solution(s));

    }
}
