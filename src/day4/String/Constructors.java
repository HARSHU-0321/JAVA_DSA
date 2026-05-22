package day4.String;

public class Constructors {
    public static void main(String[] args) {
        
        char[] ch={'j','a','v','a'};
        String s2=new String(ch);

        byte[]b = {97,98,99};
        String s3=new String(b);

        System.out.println(s2+" "+s3);


    }
}
