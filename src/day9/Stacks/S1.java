package day9.Stacks;

public class S1 {
    int arr[]= new int[5];
    int top=-1;

    //Push Operation 
    void push(int data)
    {
        //stack full or not
        if(top==arr.length-1)
        {
            System.out.println("stack overflow");
            return;
        }
        ++top;
        // push data 
        arr[top]=data;
        System.out.println(arr[top]+ " inserted");
    }

    //Pop() operation
    void pop()
    {
        if(top== -1)
        {
            System.out.println("stsck underFlow");
            return;
        }
        System.out.println(arr[top]+ " deleted");
        top--;
        arr[top]=0;

    }

    // Peek Operation
    void peek()
    {
        if(top==-1)
        {
            System.out.println("no values in stack");
            return;
        }
        System.out.println(arr[top]+" is peek element");
    }
    //To Search an element
    boolean search(int data)
    {
        if(top== -1)
        {
            return false;
        }
        for (int i = 0; i < top; i++) 
        {
            if(arr[i]==data)
            {
                return  true;
            }
        }
        return false;
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("no element in stack");
            return;
        }
        for(int i=top; i>=0 ; i--)
        {
            if(i==0)
            {
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+" ->");
            }
        }
    
    }
    void count(){
        if(top==-1){
            System.out.println("no element");
            return;
        }
        int c=0;
        for (int i = top; i >=0; i--) {
            c++;   
        }
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        //object created
        S1 ob=new S1();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        ob.push(900);
        ob.pop();//to delete single element
        ob.peek();//to display top element
        System.out.println(ob.search(90));
        ob.display();
        ob.count();


    }
}
