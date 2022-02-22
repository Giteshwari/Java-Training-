package JavaSession25_jdk9;

import java.util.ArrayList;
import java.util.List;
public class SafeVarargsDemo{

    @SafeVarargs //annotation is to make sure that the method does not perform unsafe operations on its varargs parameters
    private void display(List<String>... products) {
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        SafeVarargsDemo p = new SafeVarargsDemo();
        List<String> list = new ArrayList<String>();
        list.add("Giteshwari");
        list.add("Dnyaneshwari");
        list.add("Savita");
        list.add("kastur");
        p.display(list);
    }
}
/*
Output:
[Giteshwari, Dnyaneshwari, Savita, kastur]


// It can be used with private instance methods from JDk 9 onward.
//The @SafeVarargs annotation can be applied only to methods that cannot be overridden. Applying to the other methods
will throw a compile time error.
 */