package day7.Exception;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(9/0);
        } catch (Exception e) {
            System.out.println("there is arthmetic Exceptions");
        }
    }
}
