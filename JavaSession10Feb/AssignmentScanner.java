package JavaSession17;

import java.util.Scanner;

public class AssignmentScanner {
        int eid;
        String ename;
        double esal;
        Scanner sc = new Scanner(System.in);
        public void acceptDetails(){
            System.out.println("Enter the Employee Id: ");
            eid = sc.nextInt();
            System.out.println("Enter name oF Employee : ");
            ename = sc.next();
            System.out.println("Enter Salary of Employee : ");
            esal = sc.nextDouble();


        }
        public void displayDetails(){
            System.out.println("Name of Employee is "+ename+" whoes id is "+eid+
                    " and salary is "+ esal);

        }

        public static void main(String[] args) {

           AssignmentScanner ass = new AssignmentScanner();
           ass.acceptDetails();
           ass.displayDetails();
    }



}
/*
Output:

Enter the Employee Id:
3
Enter name oF Employee :
Gita
Enter Salary of Employee :
87000
Name of Employee is Gita whoes id is 3 and salary is 87000.0


 */