package JavaSession25_jdk9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class FactoryMethods {
    public void LFMethods() {
        List<String> list = new ArrayList<>();
        System.out.println("********COLLECTION OF 2Wheeler Brands==>JDK8 ***********");
        list.add("Jupiter");
        list.add("Vespa");
        list.add("Duet");
        list.add("Activa");
        list.add("Scooty");
        for(String l : list){
            System.out.println(l);
        }
        System.out.println("********COLLECTION OF 2Wheeler Brands==>JDK9 ***********");
        //List<String> list1 = List.of(list.toString()); or
        List<String> list1 = List.of("Jupiter","Vespa","Duet","Activa","Scooty");
        for(String l:list1) {
            System.out.println(l);
        }
    }

    public void SFMethods(){
        System.out.println("***************---Collection of 2 Wheeler (SET)---**************** ");
        Set<String> set = Set.of("Jupiter","Vespa","Duet","Activa","Scooty");
        for(String l:set) {
            System.out.println(l);
        }
    }


    public void MFMethods(){
        System.out.println("***************---Collection of 2 Wheeler (MAP)---**************** ");
        Map<Integer,String> map = Map.of(1,"Jupiter",2,"Vespa",3,"Duet",4,"Activa",5,"Scooty");
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

}




public class FactoryMethodDemo {
    public static void main(String args[]){
        FactoryMethods obj_l=new FactoryMethods();
        obj_l.LFMethods();
        obj_l.SFMethods();
        obj_l.MFMethods();
    }
}
/*
Output:
********COLLECTION OF 2Wheeler Brands==>JDK8 ***********
Jupiter
Vespa
Duet
Activa
Scooty
********COLLECTION OF 2Wheeler Brands==>JDK9 ***********
Jupiter
Vespa
Duet
Activa
Scooty
***************---Collection of 2 Wheeler (SET)---****************
Scooty
Activa
Jupiter
Vespa
Duet
***************---Collection of 2 Wheeler (MAP)---****************
1 Jupiter
3 Duet
2 Vespa
5 Scooty
4 Activa

 */