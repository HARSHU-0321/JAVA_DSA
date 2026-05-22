package day4.Assignments;

public class SumOfDiagonal {

    public static int solution(int[][] arr){
        int size=arr.length;
        int sum=0;
        for (int i = 0; i < size; i++) {
            //primary diag i==j
            sum = sum+arr[i][i];

            //secondary i+j==size-1
            sum = sum+arr[i][size-1-i];
        }
        if(size%2 ==1){

            sum = sum -arr[size/2][size/2];

        }
        return  sum;

    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(solution(arr));
    }
    
}
/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Sum of diagonals
        for (int i = 0; i < n; i++) {
            sum += a[i][i]; // Primary diagonal
            if (i != n - 1 - i) {
                sum += a[i][n - 1 - i]; // Secondary diagonal
            }
        }

        System.out.println(sum);
    }
}
*/