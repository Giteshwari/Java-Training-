package JavaSession18;

class Runnable1 implements Runnable{
    @Override
    public void run() {
        int i =1;
        while(i<100){
            System.out.println("Thread 1 is Running "+i+ "th time");
            i++;
        }
    }
}
class Runnable2 implements Runnable{
    @Override
    public void run() {
        int i =1;
        while(i<100){
            System.out.println("Thread 2 is Running "+i+ "th time");
            i++;
        }
    }
}


public class ThreadMethodsPractice {

    public static void main(String[] args) {
        Runnable1 obj1 = new Runnable1();
        Runnable2 obj2 = new Runnable2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        Thread t3 = new Thread(obj2);
        t1.start();
        System.out.println(t1.isAlive());

        t1.checkAccess();
        try{

            t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        System.out.println(t2.isDaemon());
        t3.start();
        System.out.println(t1.getName());
        System.out.println(t3.isInterrupted());
        t3.setPriority(10);
        System.out.println(t3.getPriority());
    }
}
/*
Output:
true
Thread 1 is Running 1th time
Thread 1 is Running 2th time
Thread 1 is Running 3th time
Thread 1 is Running 4th time
Thread 1 is Running 5th time
Thread 1 is Running 6th time
Thread 1 is Running 7th time
Thread 1 is Running 8th time
Thread 1 is Running 9th time
Thread 1 is Running 10th time
Thread 1 is Running 11th time
Thread 1 is Running 12th time
Thread 1 is Running 13th time
Thread 1 is Running 14th time
Thread 1 is Running 15th time
Thread 1 is Running 16th time
Thread 1 is Running 17th time
Thread 1 is Running 18th time
Thread 1 is Running 19th time
Thread 1 is Running 20th time
Thread 1 is Running 21th time
Thread 1 is Running 22th time
Thread 1 is Running 23th time
Thread 1 is Running 24th time
Thread 1 is Running 25th time
Thread 1 is Running 26th time
Thread 1 is Running 27th time
Thread 1 is Running 28th time
Thread 1 is Running 29th time
Thread 1 is Running 30th time
Thread 1 is Running 31th time
Thread 1 is Running 32th time
Thread 1 is Running 33th time
Thread 1 is Running 34th time
Thread 1 is Running 35th time
Thread 1 is Running 36th time
Thread 1 is Running 37th time
Thread 1 is Running 38th time
Thread 1 is Running 39th time
Thread 1 is Running 40th time
Thread 1 is Running 41th time
Thread 1 is Running 42th time
Thread 1 is Running 43th time
Thread 1 is Running 44th time
Thread 1 is Running 45th time
Thread 1 is Running 46th time
Thread 1 is Running 47th time
Thread 1 is Running 48th time
Thread 1 is Running 49th time
Thread 1 is Running 50th time
Thread 1 is Running 51th time
Thread 1 is Running 52th time
Thread 1 is Running 53th time
Thread 1 is Running 54th time
Thread 1 is Running 55th time
Thread 1 is Running 56th time
Thread 1 is Running 57th time
Thread 1 is Running 58th time
Thread 1 is Running 59th time
Thread 1 is Running 60th time
Thread 1 is Running 61th time
Thread 1 is Running 62th time
Thread 1 is Running 63th time
Thread 1 is Running 64th time
Thread 1 is Running 65th time
Thread 1 is Running 66th time
Thread 1 is Running 67th time
Thread 1 is Running 68th time
Thread 1 is Running 69th time
Thread 1 is Running 70th time
Thread 1 is Running 71th time
Thread 1 is Running 72th time
Thread 1 is Running 73th time
Thread 1 is Running 74th time
Thread 1 is Running 75th time
Thread 1 is Running 76th time
Thread 1 is Running 77th time
Thread 1 is Running 78th time
Thread 1 is Running 79th time
Thread 1 is Running 80th time
Thread 1 is Running 81th time
Thread 1 is Running 82th time
Thread 1 is Running 83th time
Thread 1 is Running 84th time
Thread 1 is Running 85th time
Thread 1 is Running 86th time
Thread 1 is Running 87th time
Thread 1 is Running 88th time
Thread 1 is Running 89th time
Thread 1 is Running 90th time
Thread 1 is Running 91th time
Thread 1 is Running 92th time
Thread 1 is Running 93th time
Thread 1 is Running 94th time
Thread 1 is Running 95th time
Thread 1 is Running 96th time
Thread 1 is Running 97th time
Thread 1 is Running 98th time
Thread 1 is Running 99th time
false
Thread-0
false
10
Thread 1 is Running 1th time
Thread 1 is Running 2th time
Thread 1 is Running 3th time
Thread 1 is Running 4th time
Thread 1 is Running 5th time
Thread 1 is Running 6th time
Thread 1 is Running 7th time
Thread 1 is Running 8th time
Thread 1 is Running 9th time
Thread 1 is Running 10th time
Thread 1 is Running 11th time
Thread 1 is Running 12th time
Thread 1 is Running 13th time
Thread 1 is Running 14th time
Thread 1 is Running 15th time
Thread 1 is Running 16th time
Thread 1 is Running 17th time
Thread 1 is Running 18th time
Thread 1 is Running 19th time
Thread 1 is Running 20th time
Thread 1 is Running 21th time
Thread 2 is Running 1th time
Thread 2 is Running 2th time
Thread 2 is Running 3th time
Thread 2 is Running 4th time
Thread 2 is Running 5th time
Thread 2 is Running 6th time
Thread 2 is Running 7th time
Thread 2 is Running 8th time
Thread 2 is Running 9th time
Thread 2 is Running 10th time
Thread 2 is Running 11th time
Thread 2 is Running 12th time
Thread 2 is Running 13th time
Thread 2 is Running 14th time
Thread 2 is Running 15th time
Thread 2 is Running 16th time
Thread 2 is Running 17th time
Thread 2 is Running 18th time
Thread 2 is Running 19th time
Thread 2 is Running 20th time
Thread 2 is Running 21th time
Thread 2 is Running 22th time
Thread 2 is Running 23th time
Thread 2 is Running 24th time
Thread 2 is Running 25th time
Thread 2 is Running 26th time
Thread 2 is Running 27th time
Thread 2 is Running 28th time
Thread 2 is Running 29th time
Thread 2 is Running 30th time
Thread 2 is Running 31th time
Thread 2 is Running 32th time
Thread 2 is Running 33th time
Thread 2 is Running 34th time
Thread 2 is Running 35th time
Thread 2 is Running 36th time
Thread 2 is Running 37th time
Thread 2 is Running 38th time
Thread 2 is Running 39th time
Thread 2 is Running 40th time
Thread 2 is Running 41th time
Thread 2 is Running 42th time
Thread 2 is Running 43th time
Thread 2 is Running 44th time
Thread 2 is Running 45th time
Thread 2 is Running 46th time
Thread 2 is Running 47th time
Thread 2 is Running 48th time
Thread 2 is Running 49th time
Thread 2 is Running 50th time
Thread 2 is Running 51th time
Thread 2 is Running 52th time
Thread 2 is Running 53th time
Thread 2 is Running 54th time
Thread 2 is Running 55th time
Thread 2 is Running 56th time
Thread 2 is Running 57th time
Thread 2 is Running 58th time
Thread 2 is Running 59th time
Thread 2 is Running 60th time
Thread 2 is Running 61th time
Thread 2 is Running 62th time
Thread 2 is Running 63th time
Thread 2 is Running 64th time
Thread 2 is Running 65th time
Thread 2 is Running 66th time
Thread 2 is Running 67th time
Thread 2 is Running 68th time
Thread 2 is Running 69th time
Thread 2 is Running 70th time
Thread 2 is Running 71th time
Thread 2 is Running 72th time
Thread 2 is Running 73th time
Thread 2 is Running 74th time
Thread 2 is Running 75th time
Thread 2 is Running 76th time
Thread 2 is Running 77th time
Thread 2 is Running 78th time
Thread 2 is Running 79th time
Thread 2 is Running 80th time
Thread 2 is Running 81th time
Thread 2 is Running 82th time
Thread 2 is Running 83th time
Thread 2 is Running 84th time
Thread 2 is Running 85th time
Thread 2 is Running 86th time
Thread 2 is Running 87th time
Thread 2 is Running 88th time
Thread 2 is Running 89th time
Thread 2 is Running 90th time
Thread 2 is Running 91th time
Thread 2 is Running 92th time
Thread 2 is Running 93th time
Thread 2 is Running 94th time
Thread 2 is Running 95th time
Thread 2 is Running 96th time
Thread 2 is Running 97th time
Thread 2 is Running 98th time
Thread 2 is Running 99th time
Thread 1 is Running 22th time
Thread 1 is Running 23th time
Thread 1 is Running 24th time
Thread 1 is Running 25th time
Thread 1 is Running 26th time
Thread 1 is Running 27th time
Thread 1 is Running 28th time
Thread 1 is Running 29th time
Thread 1 is Running 30th time
Thread 1 is Running 31th time
Thread 1 is Running 32th time
Thread 1 is Running 33th time
Thread 1 is Running 34th time
Thread 1 is Running 35th time
Thread 1 is Running 36th time
Thread 1 is Running 37th time
Thread 1 is Running 38th time
Thread 1 is Running 39th time
Thread 1 is Running 40th time
Thread 1 is Running 41th time
Thread 1 is Running 42th time
Thread 1 is Running 43th time
Thread 1 is Running 44th time
Thread 1 is Running 45th time
Thread 1 is Running 46th time
Thread 1 is Running 47th time
Thread 1 is Running 48th time
Thread 1 is Running 49th time
Thread 1 is Running 50th time
Thread 1 is Running 51th time
Thread 1 is Running 52th time
Thread 1 is Running 53th time
Thread 1 is Running 54th time
Thread 1 is Running 55th time
Thread 1 is Running 56th time
Thread 1 is Running 57th time
Thread 1 is Running 58th time
Thread 1 is Running 59th time
Thread 1 is Running 60th time
Thread 1 is Running 61th time
Thread 1 is Running 62th time
Thread 1 is Running 63th time
Thread 1 is Running 64th time
Thread 1 is Running 65th time
Thread 1 is Running 66th time
Thread 1 is Running 67th time
Thread 1 is Running 68th time
Thread 1 is Running 69th time
Thread 1 is Running 70th time
Thread 1 is Running 71th time
Thread 1 is Running 72th time
Thread 1 is Running 73th time
Thread 1 is Running 74th time
Thread 1 is Running 75th time
Thread 1 is Running 76th time
Thread 1 is Running 77th time
Thread 1 is Running 78th time
Thread 1 is Running 79th time
Thread 1 is Running 80th time
Thread 1 is Running 81th time
Thread 1 is Running 82th time
Thread 1 is Running 83th time
Thread 1 is Running 84th time
Thread 1 is Running 85th time
Thread 1 is Running 86th time
Thread 1 is Running 87th time
Thread 1 is Running 88th time
Thread 1 is Running 89th time
Thread 1 is Running 90th time
Thread 1 is Running 91th time
Thread 1 is Running 92th time
Thread 1 is Running 93th time
Thread 1 is Running 94th time
Thread 1 is Running 95th time
Thread 1 is Running 96th time
Thread 1 is Running 97th time
Thread 1 is Running 98th time
Thread 1 is Running 99th time

 */
