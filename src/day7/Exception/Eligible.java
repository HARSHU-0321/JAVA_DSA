package day7.Exception;

public class Eligible {
    public static void main(String[] args) {
        int n =20;
        try {
            if(n>18){
                throw new ArithmeticException("You are eligible for Working");

            }
            System.out.println("not eligible for working");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
