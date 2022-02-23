public class Main {
    public static void main(String[] args) {
        System.out.println("I am Jar file ");
        if(args.length >0){
            System.out.println("Have some arguments");
            for (String arguments:args) {
                System.out.println("The Argumets are: "+arguments);

            }
        }
    }
}
