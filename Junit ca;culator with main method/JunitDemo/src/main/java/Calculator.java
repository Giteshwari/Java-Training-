public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
}

class Division{
    public int div(int a,int b)
    {
        if(b==0)
            throw new ArithmeticException("B's value cannot be 0");

        return (a/b);
    }
}

class Multiplication{
    public int mult(int a , int b)
    {
        return a*b;
    }

}
class Subtraction{
    public int sub(int a,int b){
        return a-b;
    }




}

