package JavaSession20;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class ListIteratorsDemo {
    public static void main(String[] args) {

        Stack<String> list = new Stack<>();
        list.add("Gita");
        list.add("Sita");
        list.add("Gita");
        list.add(null);
        list.add("Rita");
        list.add("Prita");

        System.out.println("Using Iterator--- ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        ListIterator i = list.listIterator();

        System.out.println("ListIterator---");
        System.out.println("Forward Traversal--- ");

        while (i.hasNext())
            System.out.print(i.next() + " ");

        System.out.println();

        System.out.println("Backward Traversal--- ");

        while (i.hasPrevious())
            System.out.print(i.previous() + " ");


    }
}
/*
Output:

Using Iterator---
Gita Sita Gita null Rita Prita
ListIterator---
Forward Traversal---
Gita Sita Gita null Rita Prita
Backward Traversal---
Prita Rita null Gita Sita Gita

//Difference between ListIterator and Iterator
Iterators only retrieves the data in forward direction only ,where as ListIterator can retrive the data in forward as well as in backword direction .
 */


