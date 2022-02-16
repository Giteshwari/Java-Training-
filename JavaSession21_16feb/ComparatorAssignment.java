package JavaSession21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int id;
    String name;
    float Salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
class BySalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.Salary-o2.Salary);
    }
}
class ByName_sort implements  Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class ComparatorAssignment {


    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "Ak", 20000.00f));
        list.add(new Employee(6, "Fk", 14999));
        list.add(new Employee(2, "Bk", 15000f));
        list.add(new Employee(4, "DK", 50000));
        list.add(new Employee(3, "Ck", 10000));
        list.add(new Employee(5, "Ek", 7000));


        System.out.println("Employee List is: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("After sorting by Salary Grater than 15000");
        Collections.sort(list, new BySalary());
        for (Employee e : list) {
            if (e.Salary > 15000)
                System.out.println(e);
        }

        System.out.println("After Sorting by name: ");
        Collections.sort(list, new ByName_sort());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        }

}
/*
Output:
Employee List is:
Employee{id=1, name='Ak', Salary=20000.0}
Employee{id=6, name='Fk', Salary=14999.0}
Employee{id=2, name='Bk', Salary=15000.0}
Employee{id=4, name='DK', Salary=50000.0}
Employee{id=3, name='Ck', Salary=10000.0}
Employee{id=5, name='Ek', Salary=7000.0}

After sorting by Salary Grater than 15000:
Employee{id=1, name='Ak', Salary=20000.0}
Employee{id=4, name='DK', Salary=50000.0}

After Sorting by name:
Employee{id=1, name='Ak', Salary=20000.0}
Employee{id=2, name='Bk', Salary=15000.0}
Employee{id=3, name='Ck', Salary=10000.0}
Employee{id=4, name='DK', Salary=50000.0}
Employee{id=5, name='Ek', Salary=7000.0}
Employee{id=6, name='Fk', Salary=14999.0}

 */
