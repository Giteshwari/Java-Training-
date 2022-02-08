package JavaSession15;

public class InvalidAmountException extends Exception {
    InvalidAmountException(){
        System.out.println("Default ");
    }
    InvalidAmountException(String msg){
        System.out.println("Parameter String:: Constructor==>"+msg);
    }
    InvalidAmountException(Throwable cause){
        System.out.println("Parameter  Throwable:: Constructor==>"+cause);
    }

    InvalidAmountException(String msg,Throwable cause){
        System.out.println("Parameters String,Throwable:: Constructor==>InvalidAmountException");
    }

}
