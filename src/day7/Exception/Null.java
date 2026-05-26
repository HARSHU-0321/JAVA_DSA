package day7.Exception;

public class Null {
    public static void main(String[] args) {
        String str=null;
        String s1="raj";
        try {
            if(str.equals(s1)){
        System.out.println("equal");
        }
        } catch (Exception e) {
            System.out.println("null pointer Exception");
        }
        
    }
}
