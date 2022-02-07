package JavaSession14;
import java.util.Scanner;
public class ABC {
 public static void main(String[] args) {
 int[] array = new int[10];
 int sum = 0;
 Scanner sc = new Scanner(System.in);
 try{
 for (int i = 0; i <11; i++) {
 array[i] = sc.nextInt();
 sum = sum + array[i];
 }
 }
 catch(ArrayIndexOutOfBoundsException e){
 System.out.println(e);
 System.out.println("You must take only 10 elements");
 }
 }
}
/*
Output:
1
2
3
4
5
6
7
8
9
10
11
java.lang.ArrayIndexOutOfBoundsException: 10
You must take only 10 Elements
*/
