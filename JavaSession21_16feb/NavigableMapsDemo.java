package JavaSession21;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapsDemo {
    public static void main(String[] args) {
        NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

        nm.put("C", 8);
        nm.put("Y", 9);
        nm.put("W", 4);
        nm.put("T", 5);
        nm.put("B", 6);
        nm.put("A", 7);
        nm.put("S", 11);
        System.out.println("Mappings of NavigableMap : " + nm);
        System.out.println("Descending Set  : "+nm.descendingKeySet());
        System.out.println("Floor Entry  : "+nm.floorEntry("T"));
        System.out.println("First Entry  : "+nm.firstEntry());
        System.out.println("Last Key :"+nm.lastKey());
        System.out.println("First Key : "+nm.firstKey());
        System.out.println("Removing Element: "+nm.remove("T"));
        System.out.println("Ceiling key is : "+nm.ceilingKey("B"));
        System.out.println("Ceiling Entry is: "+nm.ceilingEntry("Y"));
        System.out.println("HeadMap is: " +nm.headMap("W"));
        System.out.println("SubMap is: "+nm.subMap("B",true, "Y",true));
        System.out.println("TailMap is : "+nm.tailMap("C"));
        System.out.println("Map in Forward Direction :"+nm);
        System.out.println("In Reverse Direction : "+nm.descendingMap());
    }

}
/*

Output:
Mappings of NavigableMap : {A=7, B=6, C=8, S=11, T=5, W=4, Y=9}
Descending Set  : [Y, W, T, S, C, B, A]
Floor Entry  : T=5
First Entry  : A=7
Last Key :Y
First Key : A
Removing Element: 5
Ceiling key is : B
Ceiling Entry is: Y=9
HeadMap is: {A=7, B=6, C=8, S=11}
SubMap is: {B=6, C=8, S=11, W=4, Y=9}
TailMap is : {C=8, S=11, W=4, Y=9}
Map in Forward Direction :{A=7, B=6, C=8, S=11, W=4, Y=9}
In Reverse Direction : {Y=9, W=4, S=11, C=8, B=6, A=7}

*/