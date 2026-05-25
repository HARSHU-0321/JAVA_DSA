package day6.Inheritance;

class A{
    public  void m1(){
        System.out.println("mi in a");
    }
}
class B{
    public  void m1(){
        System.out.println("mi in b");
    }
}
//java wont support multiple inheritence due to ambigous nature


//alternate approch of multiple inhrt concept using inference
interface A{
    public void m1();
}
interface B{
    public void m1();
}
class C implements A,B{
    public void m1(){
        System.out.println("m1 in C");
    }
}


public class Is_A {
    
}
