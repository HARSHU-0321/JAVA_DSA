package day6;

public class Test1 {
    //private : can be accessible whithin the class and same package
    //Public : can be accessible whithin the class and same package and different package
    //protectred : can be accessible whithin the class and same package


    private int a;
    public int b;
    int c;
    protected  int d;

    public int printA(){
        return this.a;
    }

    public void setA(int a){
        this.a=a;
    }

    }

