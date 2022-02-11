package JavaSession18;
import java.util.Scanner;
public class OddNumberClass extends Thread{
static int i = 1;

    public void oddNumbers(int Bound){

        while(i<=Bound){
          if((i%2)==1){
              System.out.println(i+" ");
          }
          i++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bound: ");
        int bound = sc.nextInt();

        OddNumberClass odd = new OddNumberClass();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Odd Numbers in the Bound are: ");
                odd.oddNumbers(bound);
            }
        });

        t1.start();

    }
}
/*
Output:
Enter the Bound:
10
Odd Numbers in the Bound are:
1
3
5
7
9
 */