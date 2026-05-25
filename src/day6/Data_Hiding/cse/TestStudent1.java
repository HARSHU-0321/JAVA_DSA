package day6.Data_Hiding.cse;

import day6.Data_Hiding.Management.Student1;

public class TestStudent1 {
    

    public static void main(String[] args) {
        
        Student1 std1=new Student1();


        std1.name="Student2";

        std1.displayDetails();
        System.out.println(std1.name);
        // System.out.println(std1.dept);
        // System.out.println(std1.amount);


        // System.out.println(std1.subject); it is privatge

    }
}


