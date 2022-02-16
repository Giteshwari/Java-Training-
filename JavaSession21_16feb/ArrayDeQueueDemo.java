package JavaSession21;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeQueueDemo {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<String>();
        queue.add("B");
        queue.add("A");
        queue.add("D");
        queue.add("E");

        System.out.println("First Element: Head : "+queue.element());
        System.out.println("peek:"+queue.peek());
        System.out.println("removing head: "+queue.remove());
        queue.offerFirst("C");
        queue.offerLast("A");
        Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("***********ELEMENTS OF DEQUEUE ARE***********");
        //Iterator:traversal
        Iterator itr1=queue.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("First element to be removed: "+queue.peekFirst());
        queue.pollFirst();
        System.out.println("Last Element to be removed: "+queue.peekLast());
        queue.pollLast();
        System.out.println("***********ELEMENTS OF DEQUEUE ARE***********");
        //Iterator:traversal
        Iterator itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("Printing Backwords: ");
        for (Iterator itr = queue.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

    }
}
/*
Output:
First Element: Head : B
peek:B
removing head: B
C A D E A
***********ELEMENTS OF DEQUEUE ARE***********
C
A
D
E
A
First element to be removed: C
Last Element to be removed: A
***********ELEMENTS OF DEQUEUE ARE***********
A
D
E
Printing Backwords:
E D A
 */
