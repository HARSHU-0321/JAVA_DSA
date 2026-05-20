package day2.Array;

public class SumArray {
        public static void main(String[] args){
		int[] arr1={1,2,3,4,5};
		int[] arr2={6,7,8,4,5};
        int[] sum=new int[5];

		
        for(int i=0;i<5;i++)
         {
        sum[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<5;i++)
         {
        System.out.print(sum[i]+" ");
        }
       
 }
    
}
