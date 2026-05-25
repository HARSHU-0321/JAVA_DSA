package day6.Inheritance;

 class P {
    public void m1(){
        System.out.println("m1");
    }
}
class C extends P{
    public void m2(){
        System.out.println("m2");
    }
}
public class Test{
    public static void main(String[] args) {

        //case 1:acces to child & parent
//compileTime<- : ->runTime
            C c1=new C(); 
        c1.m1();
        c1.m2();

        //case 2:acces to only parent
        P p=new P(); 
        p.m1();
        // p.m2(); 

        //case 3:acces to onl
        P p1=new C(); 
        p1.m1();
        // p1.m2();

        //case 4:child canot store parent
        // C c2=new P();  


    }
}
