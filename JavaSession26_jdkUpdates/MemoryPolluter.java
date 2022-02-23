package JavaTraining_jdkUpdates;

public class MemoryPolluter {

    static final int MEGABYTE_IN_BYTES = 1024 * 1024;
    static final int ITERATION_COUNT = 1024 * 10;

    public static void main(String[] args) {
        System.out.println("Starting pollution");

        for (int i = 0; i < ITERATION_COUNT; i++) {
            byte[] array = new byte[MEGABYTE_IN_BYTES];
        }

        System.out.println("Terminating");
    }
}


/*
Output:
Starting pollution
Terminating


// when  run the Application without Standard Vm option
output:

 Starting pollution
    Terminating due to java.lang.OutOfMemoryError: Java heap space


 As the code creates one-megabyte-arrays in a loop. Since we repeat the loop 10240 times,
 it means we allocate 10 gigabytes of memory, which is probably higher than the available maximum heap size.

Because  Once the available Java heap is exhausted, the JVM will shut down. and our Application terminates with outOfMemory Error.



 */
