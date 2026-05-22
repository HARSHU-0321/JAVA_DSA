package day4.String;

public class S2 {
    public static void main(String[] args) {
        String s1= new String("hello hii");
        String s2= new String("hello hii");  
        
        System.out.println(s1==s2);//false

        String s3="hello hii";
        System.out.println(s2==s3);//flase


        String s4="hello hii";
        System.out.println(s3==s4);//true

        String s5 = "hello "+"hii";
        System.out.println(s4==s5);//true

        String s6="hello";
        String s7= s6+"hii";
        System.out.println(s4==s7);//false

        String s8="hello";
        final String s9= s8+"hii";
        System.out.println(s4==s9);//true?
    }
}
