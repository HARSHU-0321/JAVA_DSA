package day2.Array;

public class MinMax {
    public static void main(String[] args) {

		// Scanner sc=new Scanner(System.in);
        // System.out.println("enter size");
        // int n=sc.nextInt();
        // int[] arr=new int[n];


        //  for(int i=0;i<=arr.length;i++){
        //     arr[i]=sc.nextInt();
        //  }

        int [] arr={1,2,3,4,5};
         int min=arr[0];
         int max=arr[0];

         for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
            min=arr[i];
            }
            if(arr[i] > max){
                max=arr[i];
            }

         }
         System.out.println("minimum element is: "+min);
         System.out.println("maximum element is: "+max);
        //  sc.close();



    }
}
/* 
sum>>>>>>>>>>
minmax>>>>>>>>>
4.reverse an array>>>>>>
5,even and odd elements od an array>>>>>>>>>>
palindrome or nor
search element in array using linear and binary search
to move all 0s at the end
prog to left by 1>>>>>>>>
                k values>>>>>>>>>>>>>>>>>
check the array is sorted or not
*/