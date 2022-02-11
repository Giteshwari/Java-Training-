package JavaSession18;

public class RunMethodCall extends Thread {

        public void run()
        {
            System.out.println("Called Run Explicitly ");
        }
        public static void main(String args[])
        {
            RunMethodCall t1=new RunMethodCall ();

            t1.run();
        }


}
/*
Output:
Called Run Explicitly

*******************************************---Explanation---**************************************************************
We sure can do that but Calling run() Explicitly will not start a separate call stack,
If you call it directly, then it will execute current thread and not in another thread, If start isn't called,
then the Thread created will never run. The main thread will finish and the Thread will be garbage collected.
 */
