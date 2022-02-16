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


        System.out.println("Mappings of NavigableMap : " + nm);
        System.out.println("Descending Set  : "+nm.descendingKeySet());
        System.out.println("Floor Entry  : "+nm.floorEntry("T"));
        System.out.println("First Entry  : "+nm.firstEntry());
        System.out.println("Last Key :"+nm.lastKey());
        System.out.println("First Key : "+nm.firstKey());
        System.out.println("Map in Forward Direction :"+nm);
        System.out.println("Removing Element: "+nm.remove("T"));
        System.out.println(nm.subMap("Y",true,
                "B",true));
        System.out.println("In Reverse Direction : "+nm.descendingMap());
    }

}
