package day7.Exception;

public class ThrowExcep {
    public static void main(String[] args) {
        int n=200;
        try {
            if(n>30){
                throw new ArithmeticException("> 35");

            }
            System.out.println("<35");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
