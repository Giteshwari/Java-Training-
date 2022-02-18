package JavaSession23_Enhancements;
public class Addition{

    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public int sum(int a,int b,int c, int d, int e){
        return a+b+c+d+e;
    }
}
class Varargs_Addition {

    public int sum(int... args) {
        int sum = 0;
        for (int i : args)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Varargs_Addition var_a = new Varargs_Addition();
        int total=var_a.sum(1,2,3,4,5,6,7);
        System.out.println("sum of given numbers Using VarARGS: "+total);

        Addition a = new Addition();
        int total1 = a.sum(1,2,3,4);
        System.out.println("Sum of numbers using Addition with 4 Arguments: "+total1);

        int total2 = a.sum(1,2);
        System.out.println("Sum of numbers using Addition with 2 Arguments: "+total2);


    }
}
/*
Output:

sum of given numbers Using VarARGS: 28
Sum of numbers using Addition with 4 Arguments: 10
Sum of numbers using Addition with 2 Arguments: 3

 */