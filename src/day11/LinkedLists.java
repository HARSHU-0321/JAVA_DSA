package day11;
//node creation

class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
public class LinkedLists {
    Node head;
    public void addf(int data){
        
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        nn.next= head;
        head=nn;

    
    }
    public void pl(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
            System.out.print("null");

        }
        public void addl(int data){
            Node nn= new Node(data);
            if(head==null){
                head=nn;
                return;
            }
            Node temp=head;
            //checking temp.next is null or not
            while(temp.next!=null){
                temp=temp.next;
            }
            //if temp.nect is null.then add nn to temp.next
            temp.next=nn;
                System.out.print("null");

            }
    public void count(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
            System.out.print("  count of Linked List is : "+c);
 
    public void del(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

    }
    
    public static void main(String[] args) {
        LinkedLists ob=new LinkedLists();
        ob.addf(90);
        ob.addf(890);
        ob.addf(867);
        ob.addl(999);
        ob.del();

        ob.pl();
        ob.count();
        


    }
}
/*
public static void main(String[] args) {
        //node intialization
        Node nn=new Node(90);
        System.out.println(nn.data);
    }
*/
/*
   
public class LinkedLists {
    Node head;
    public void addf(int data){
        
        Node nn=new Node(90);
        if(head==null){
            head=nn;
            return;
        }
        nn.next= head;
        head=nn;

    
    }
    
    public static void main(String[] args) {
        LinkedLists ob=new LinkedLists();
        ob.addf(90);
        ob.addf(80);


    }
*/
/*  PRINT LINKED LIST
public class LinkedLists {
    Node head;
    public void addf(int data){
        
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        nn.next= head;
        head=nn;

    
    }
    public void pl(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
            System.out.print("null");

    }
    
    public static void main(String[] args) {
        LinkedLists ob=new LinkedLists();
        ob.addf(90);
        ob.addf(890);
        ob.addf(867);

        ob.pl();


    }
*/
/*
TO COUNT NO.OF NODES

public void count(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
            System.out.print("  count of Linked List is : "+c);

    }
*/
/*ADDING AT END
public void addl(int data){
            Node nn= new Node(data);
            if(head==null){
                head=nn;
                return;
            }
            Node temp=head;
            //checking temp.next is null or not
            while(temp.next!=null){
                temp=temp.next;
            }
            //if temp.nect is null.then add nn to temp.next
            temp.next=nn;
                System.out.print("null");

            }
*/