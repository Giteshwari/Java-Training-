package JavaSession21;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListInQueue {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();


        ll.offer("A");
        ll.offer("B");
        ll.offerLast("C");
        ll.offerFirst("D");
        ll.add(2, "E");
        System.out.println(ll);
        ll.poll();
        ll.remove(3);
        ll.removeFirst();
        System.out.println("Peaking into list: "+ll.element());

        Iterator it = ll.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }

        System.out.println("printing backword: ");
        Iterator it1 = ll.descendingIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
/*
Output:
[D, A, E, B, C]
Peaking into list: E
E
B
printing backword:
B
E
 */