package JavaSession17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String args[]) throws FileNotFoundException , IOException,ClassNotFoundException {
        ObjectInputStream obj=new ObjectInputStream(new FileInputStream("src/JavaSession17/EmpSerialNew.txt"));
        Employee obj_e1= (Employee) obj.readObject();
        System.out.println("Deserialization done successfully");
        System.out.println("Employee id :"+obj_e1.eid+" \nName::"+obj_e1.ename+" \nSalary ::"+obj_e1.esal);
    }
}
/*
output:
Deserialization done successfully
Employee id :121
Name::null
Salary ::50000.0

 */