package day7.Exception;

public class DivideTwo {
    
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try{
            int res=a/b;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Zero Exception");
        }
        
    }
}
