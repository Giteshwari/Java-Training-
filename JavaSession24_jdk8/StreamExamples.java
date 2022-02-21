package JavaSession24_jdk8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        long count = stream
                .map((value) -> { return value.toLowerCase(); })
                .count();

        System.out.println("count = " + count);

        List<Integer> numbers = Arrays.asList( 2, 2, 8, 10);

        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

        System.out.println("Unique Squares of Numbers using map: = "+squaresList);

        int result = numbers
                .stream()
                .reduce(0,(subtotal,element)->subtotal + element);
        System.out.println(" Reduced results: "+result);
        //identity is 0 which is integer value, it stores initial value of reduction
        //operation also default result when the stream of integervalue is empty.

        //************ Matching
        boolean answer = numbers
                .stream()
                .allMatch(n-> n % 2 ==0);


        System.out.println("Matching operation : "+answer);



    }
}
/*
Output:

count = 3
Unique Squares of Numbers using map: = [4, 64, 100]
 Reduced results: 22
Matching operation : true
 */