package JavaSession17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

        int id=0;
        String name;
        double  salary;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        public void accepetDetails() throws IOException{
            System.out.println("Enter Id of Employee::");
            id=Integer.parseInt(br.readLine());

            System.out.println("Enter Salary::");
            salary=Double.parseDouble(br.readLine());

            System.out.println("Enter the Employee name::");
            name=br.readLine();

        }

        public void displayDetails(){
            System.out.println("Name of Employee is "+name+" whoes id is "+id+
                    " and salary is "+ salary);
        }


        public static void main(String[] args) throws IOException {

            BufferedReaderDemo bfr = new BufferedReaderDemo();
            bfr.accepetDetails();
            bfr.displayDetails();

    }


}
/*
output:
Enter Id of Employee::
1
Enter Salary::
87000
Enter the Employee name::
Gita

Name of Employee is Gita whoes id is 1 and salary is 87000.0


 */