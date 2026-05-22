package day4.String;

public class Methods {
    public static void main(String[] args) {
        String str=" ";
        str.trim();
        System.out.println(str.equals(" ")+" "+str.isEmpty());        
        String s1 = new String("java");
        String s2 =s1.toString();
        String s3= s1.toLowerCase();
        String s4= s1.toUpperCase();

        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //false

        String s= "java programme";
        s=s.replace('j','i');
//        System.out.println(s);

        System.out.println(s.substring(4));
        System.out.println(s.substring(4,7));

    }
}
