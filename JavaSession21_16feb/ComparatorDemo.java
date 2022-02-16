package JavaSession21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rno;
    String name,city;

    public Student(int rno, String name, String city) {
        this.rno = rno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

//SORT BY ROLL NUMBER
class SortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rno-o2.rno;
    }
}

//SORT BY NAME
class SortByName implements  Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparatorDemo {
    public static void main(String args[]){

        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student(5,"D","Pune"));
        list.add(new Student(3,"C","Mumbai"));
        list.add(new Student(2,"A","Satara"));
        list.add(new Student(1,"B","Pune"));
        list.add(new Student(4,"E","Sangli" ));

        System.out.println("********BEFORE SORTING***********");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("********AFTER SORTING BY ROLL***********");
        Collections.sort(list,new SortByRoll());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("********AFTER SORTING BY NAME***********");
        Collections.sort(list,new SortByName());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
