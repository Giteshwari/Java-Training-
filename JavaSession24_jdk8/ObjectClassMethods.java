package JavaSession24_jdk8;

import java.util.Objects;

class Show{
    int i = 90;
    String a = "Giteshwari";
    Double b = 13.5;

    @Override
    public String toString() {
        return "Show{" +
                "i=" + i +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Show)) return false;
        Show show = (Show) o;
        return i == show.i && a.equals(show.a) && b.equals(show.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, a, b);
    }

    //notify() -> It is used to wake up only one thread that is waiting on the object.

    //notifyAll() -> notifyAll() method and multiple threads that are waiting for the notification, then all the threads get the notification.

    //finalize -> The Garbage collector is used to destroy the Object which is eligible for garbage collection.

}

public class ObjectClassMethods {

    public static void main(String[] args) {
        Show s = new Show();
        Show sh = new Show();
        Class obj = s.getClass();//getClass is the method which is Object class method

        System.out.println("Using ToString method"+s.toString());
        System.out.println("Equals with new object: "+s.equals(new Object()));
        System.out.println("Using Equals with another same class Object: "+s.equals(sh));
        System.out.println("Hashcode (Which returns integer representation of the object’s memory address): "+s.hashCode());

        System.out.println("Name: "+obj.getName());
    }
}
/*
Using ToString methodShow{i=90, a='Giteshwari', b='13.5'}
Equals with new object: false
Using Equals with another same class Object: true
Hashcode (Which returns integer representation of the object’s memory address): 1681005648
Name: JavaSession24_jdk8.Show

 //notify() -> It is used to wake up only one thread that is waiting on the object.

    //notifyAll() -> notifyAll() method and multiple threads that are waiting for the notification, then all the threads get the notification.

    //finalize -> The Garbage collector is used to destroy the Object which is eligible for garbage collection.

    //clone() ->  This method is used to create an exact copy of an object. It creates a new object and copying all data of
    the given object to that new object

 */