package day6.Data_Hiding.Management;

public class Student1 {
    public String name="harshu";
    private String subject="java";
    protected double amount=25000;
    String dept="cse";

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Amount: "+amount);
        System.out.println("Department: "+dept);
    }
}
