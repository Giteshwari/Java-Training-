package JavaSession16;
//read data from multiple files
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInStream {
    public static void main(String args[]) throws FileNotFoundException , IOException {

        FileInputStream fin1=new FileInputStream("src/JavaSession16/Abcd.txt");
        FileInputStream fin2=new FileInputStream("src/JavaSession16/Abc.txt");

        SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
        int i=0;
        while ((i=sin.read())!=-1){
            System.out.print((char)i);
        }
    }
}
