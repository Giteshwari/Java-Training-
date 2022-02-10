import java.io.Console;
import java.io.IOException;

class ConsoleClassDemo{
    public static void main(String args[]) throws Exception {
        Console c=System.console();
        if(c== null){
            System.out.println("Unable to fetch console");
        };

        System.out.println("Enter your name: ");
        String name =c.readLine();
        
        System.out.println("Enter password: ");
        char[] ch=c.readPassword();
        String pass= new String (ch);
        System.out.println("Password is: "+pass);

        if(name.equals("Gita") && pass.equals("123")){
            System.out.println("Welcome ::"+name+" you are valid user!!!!");
        }
        else
            System.out.println("Sorry!!! password does not match :( ");

    }
}
/*
Output:
Enter your name:
Gita
Enter password:

Password is: 123
Welcome ::Gita you are valid user!!!!
*/
