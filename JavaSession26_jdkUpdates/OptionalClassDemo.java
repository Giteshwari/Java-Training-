package JavaTraining_jdkUpdates;

import java.util.Optional;
public class OptionalClassDemo {
    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[3]);
        if(checkNull.isPresent()){                              //isPresent will be used to see if value is present there or not
            String lowercaseString = str[3].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("Empty!!");

        str[2] = "Hey there";


        Optional<String> empty = Optional.empty();// empty() returns an empty instance of Optional class
        System.out.println(empty);


        Optional<String> value = Optional.of(str[2]);// It returns a non-empty Optional
        System.out.println(value);
    }
}

/*
output:

Empty!!
Optional.empty
Optional[Hey there]


 */
