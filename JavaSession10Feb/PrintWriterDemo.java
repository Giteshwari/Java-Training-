package JavaSession17;


import java.io.File;
import java.io.PrintWriter;
public class PrintWriterDemo {
    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Hey There");// print in console
        writer.flush();
        writer.close();

        //Writing data into file "PrintWriterOutput.txt"
        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File("src/JavaSession17/printWriterOutput.txt"));
        writer1.write(" Giteshwari Here !");
        writer1.flush();
        writer1.close();
    }
}
/*
Output:
Hey There

*****In PrintWriterOutput.Txt File ********
Giteshwari Here !
 */


/*
we Must Close Streams as Streams represents resourse Which we must clean by calling close()
method.
some classes include flush Method. There may be resource leak if the application keep running over
and over the OS will eventually run out of Stream which could look up the system and required a 
reboot. A stream may retain a hold on limited System resources until closed
*/
