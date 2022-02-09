package JavaSession16;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class PipedExample {

    public static void main(String[] args) throws IOException {

         PipedOutputStream pipeout = new PipedOutputStream();
         PipedInputStream  pipein  = new PipedInputStream(pipeout);

         try{
             pipeout.write("Hello There, Its is a Pipe !".getBytes(StandardCharsets.UTF_8));
         }
         catch (IOException e)
         {
             System.out.println(e);
         }

         try{
             int  line = pipein.read();
             while(line != -1){
                 System.out.print((char)line);
                 line = pipein.read();
             }
         }
         catch (IOException e){
             System.out.println(e);
         }
    }
}

/*
output:
Hello There, Its is a Pipe !

 */
