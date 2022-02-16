package JavaSession21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable<Employee1>
{
    int id;
    String name;
    float Salary;

    public Employee1(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
    @Override
    public int compareTo(Employee1 o) {
        return (int) (this.Salary - o.Salary);
    }
}
public class ComparableAssignment {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<Employee1>();
        list.add(new Employee1(1, "Ak", 20000.00f));
        list.add(new Employee1(6, "Fk", 14999));
        list.add(new Employee1(2, "Bk", 15000f));
        list.add(new Employee1(4, "DK", 50000));
        list.add(new Employee1(3, "Ck", 10000));
        list.add(new Employee1(5, "Ek", 7000));

        System.out.println("BEFORE SORTING ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("AFTER SORTING BY NAME USING COMPARABLE");
        Collections.sort(list);
        for (Employee1 e : list) {
            if (e.Salary > 15000)
                System.out.println(e);

        }
    }
}