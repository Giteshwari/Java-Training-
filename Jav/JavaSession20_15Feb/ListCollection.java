package JavaSession20;
import java.util.*;

public class ListCollection {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.add("Gita");
        list.add("Sita");
        list.add("Gita");
        list.add(null);
        list.add("Rita");
        list.add("Prita");

        System.out.println("*******************************---using Iterator---*************************");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("****************************---After removing---**************************");
        list.pop();

        System.out.println("******************************---Using for each loop---*************************");
        for (String s:list
             ) {
            System.out.println("Elements in list: "+s);
        }


    }
}

/*
Output:
//ArrayList//
*******************************---using Iterator---*************************
Gita
Sita
Gita
null
******************************---Using for each loop---*************************
Elements in list: Gita
Elements in list: Sita
Elements in list: Gita
Elements in list: null

ArrayList===>
                1.Null: allowed
                2.duplicates: allowed
                3.order:: Insertion ORDERED
------------------------------------------------------------------------------------------------------------------------
//LinkedList//

*******************************---using Iterator---*************************
Gita
Sita
meet
Gita
null
****************************---After removing---**************************

Elements in list: Sita
Elements in list: meet
Elements in list: Gita
Elements in list: null

LinkedList===>
                1.Null: allowed
                2.duplicates: allowed
                3.order:: Insertion ORDERED

-----------------------------------------------------------------------------------------------------------------
//Vector//
*******************************---using Iterator---*************************
Gita
Sita
meet
Rita
null
****************************---After removing---**************************
******************************---Using for each loop---*************************
Elements in list: Gita
Elements in list: meet
Elements in list: Rita
Elements in list: null

LinkedList===>
                1.Null: allowed
                2.duplicates: allowed
                3.order:: Insertion ORDERED
---------------------------------------------------------------------------------------------------------------------
//Stack//

*******************************---using Iterator---*************************
Gita
Sita
Gita
null
Rita
Prita
****************************---After removing---**************************
******************************---Using for each loop---*************************
Elements in list: Gita
Elements in list: Sita
Elements in list: Gita
Elements in list: null
Elements in list: Rita

//poped last entered element//

Stack===>
                1.Null: allowed
                2.duplicates: allowed
                3.order:: LIFO

 */

