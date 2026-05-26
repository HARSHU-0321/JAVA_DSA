package day7.Exception;

public class ArrayException {
    public static void main(String[] args) {
        int n=7;
        int arr[]=new int[5];
        try {
            for (int i=0;i<7;i++){
                arr[i]=2;
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array is full");
        }
    }
}
/* with exception

    public static void main(String[] args) {
        int n=7;
        int arr[]=new int[5];
            for (int i=0;i<7;i++){

                arr[i]=2;       //exception is here
                System.out.println(arr[i]);
            }
    }
*/