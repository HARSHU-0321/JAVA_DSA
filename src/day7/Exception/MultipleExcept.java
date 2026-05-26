package day7.Exception;

public class MultipleExcept {
    public static void main(String[] args) {
        String s =null;
        String s1= "hii";
        int n=7;
        int arr[]=new int[8];
        try {
             for (int i=0;i<7;i++){
                arr[i]=2;
                System.out.println(arr[i]);
             }
            if(s.equals(s1)){
                System.out.println("equal");
            }
            System.out.println(9/0);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is full");
        } catch (ArithmeticException e) {
            System.out.println("Arthmetic Exception");
        }catch(NullPointerException e){
            System.out.println("Null");

        }

    }
}

