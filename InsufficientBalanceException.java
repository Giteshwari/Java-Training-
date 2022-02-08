package JavaSession15;

public class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(){
        System.out.println("Default ");
    }
    InsufficientBalanceException(String msg){
        System.out.println("Parameter String:: Constructor==>"+msg);
    }
    InsufficientBalanceException(Throwable cause){
        System.out.println("Parameter  Throwable:: Constructor==>"+cause);
    }

    InsufficientBalanceException(String msg,Throwable cause){
        System.out.println("Parameters String,Throwable:: Constructor==>InvalidAmountException");
    }
}
