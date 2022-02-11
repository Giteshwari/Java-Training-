package JavaSession18;

class AnotherThread extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
public class RestartThread extends Thread {
    public void run(){
        System.out.println("Thread 1");
    }
    public static void main(String[] args) {
        RestartThread t1 = new RestartThread();
        AnotherThread t2 = new AnotherThread();
        t1.start();
        t2.start();
        t1.start();

    }
}
/*
Output:
Exception in thread "main" java.lang.IllegalThreadStateException
Thread 1
Thread 2
	at java.lang.Thread.start(Thread.java:708)
	at JavaSession18.RestartThread.main(RestartThread.java:17)

*********************************************---Explanation---************************************************************
Above Exception Suggest That we cannot start a thread twice as it will throw an exception
IllegalThreadStateException , for first time it will run smooth but not for the
second time .
 */