package JavaSession17;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("id is "+id);

        System.out.println("Enter percentage: ");
        double per = sc.nextDouble();
        System.out.println("percentage is: "+per);

        System.out.println("name: ");
        String name = sc.next();
        System.out.println("name : "+name);

    }
}
/*
Output: Using NextLine() while taking name as Input on last line:

Enter id:
1
id is 1
Enter percentage:
78.5 Gita                  //as preceding nextDouble we are still on same line
                           //and nextLine() return rest of the current line
percentage is: 78.5
name:
name :  Gita               //That's how it returns "Gita" from the previous line
                            //"78.5 Gita"

 */


/*
Output: using Next() :
Enter id:
2
id is 2
Enter percentage:
76.5
percentage is: 76.5
name:
Gita
name : Gita

 */