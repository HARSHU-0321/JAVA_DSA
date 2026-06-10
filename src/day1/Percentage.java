package day1;

/*prog that accept marks of 5 sub and finds percentages
 and prints grades accourding to the following criteria
  percen >95   A
  betweem 80-90   B
  between  60-80     C
  below 60   D
 */
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();

        int tot=s1+s2+s3+s4+s5;
        int prct=tot/5;

         System.out.println("total: "+tot);
         System.out.println("Percentage : "+prct);
        if(prct > 90){
            System.out.println("grade A");
        }
        else if(prct >80 && prct <=90){
            System.out.println("grade B");
        }
        else if(prct >60 && prct <=80){
            System.out.println("grade C");
        }
        else {
            System.out.println("grade D");
        }

    }
}
