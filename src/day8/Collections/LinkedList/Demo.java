package day8.Collections.LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
         
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        System.out.println(ll);
        ll.addFirst(4);
        System.out.println(ll);
        ll.addLast(5);
        System.out.println(ll);
        ll.offer(6);
        System.out.println(ll);
        ll.offerFirst(5);
        System.out.println(ll);
        ll.offerLast(5);
        System.out.println(ll);
        ll.get(5);
        System.out.println(ll);
        ll.getFirst();
        System.out.println(ll);
        ll.getLast();
        System.out.println(ll);
        ll.peek();
        System.out.println(ll);
        
        ll.remove(5);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.contains(ll);
        System.out.println(ll);
        
        System.out.println(ll.size());
        


        // for (Integer a:ll){
        //     System.out.println(a);
        // }
     }
}
