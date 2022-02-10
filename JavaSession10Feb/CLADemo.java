package JavaSession17;

public class CLADemo {
    public static void main(String[] args) {


        for (String s :
                args) {
            System.out.println("Content is::"+s);
        }

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int sum=a+b;
        System.out.println("Addition using CLA::"+sum);


    }


}
/*

//Arguments Given args[0] = 4 and args[1] = 8
Output:
Command line argument::
Content is::4
Content is::8
Addition using CLA::12
 */