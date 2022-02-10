package JavaSession17;

import java.io.*;

public class SerializationDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Employee obj_e=new Employee(121,"John",50000f);

        FileOutputStream out=new FileOutputStream("src/JavaSession17/EmpSerialNew.txt");
        ObjectOutputStream obj_o=new ObjectOutputStream(out);

        obj_o.writeObject(obj_e);
        System.out.println("Serialization done Succesfully");

    }
}
//�� sr session17.Employee�>�`b��� I eidF esalL enamet Ljava/lang/String;xp   yGCP t John
