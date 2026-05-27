package day9.Queues;

public class NQueue {
    int front=-1;
    int rear=-1;
    int arr[]=new int[5];
    void enqueue(int data){
        if(rear==arr.length-1){
            System.out.println("Queue overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.err.println(arr[rear]+ " ->inserted");
    }
    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[front]+" ->deleted");
        front++;
    }
    void peek(){
        if(front==-1){
            System.out.println("no values");
            return;
        }
        System.out.println(arr[front]+" ->peek element");
    }
    void display(){
        if(front==-1){
            System.out.println("no element in stack");
            return;
        }
        for(int i=front; i<=rear ; i++){
            if(arr[i]==arr[rear]){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+" ->");
            }
        }
    
    }
    /*
    void count(){
        if(top==-1){
            System.out.println("no element");
            return;
        }
        int c=0;
        for (int i = top; i >=0; i--) {
            c++;   
        }
        
    */
   
    public static void main(String[] args) {
        NQueue ob=new NQueue();
        ob.enqueue(78);
        ob.enqueue(88);
        ob.enqueue(98);

        ob.dequeue();
        ob.peek();
        ob.display();
    }
}
