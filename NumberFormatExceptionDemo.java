package JavaSession14;
import java.util.Scanner;
public class NumberFormatExceptionDemo {
 public static void main(String[] args) {
 int var_a;
 Scanner sc = new Scanner(System.in);
 try{
 System.out.println("Enter the value: ");
 var_a =sc.nextInt();
 }
 catch(Exception e){
 System.out.println("You can only enter an Integer");
 }
 }
 /*
 Output:
 Enter the Value : 
 a
 You can only enter an Integer
 */
 
 
