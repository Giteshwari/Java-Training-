package JavaSession16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        File f=new File("src/JavaSession16/Abcd.txt");

        FileOutputStream fout=new FileOutputStream(f);
        if(f.exists()){
            //Int
            fout.write(65);//A

            //String
            String s=" ,Hello there, Welcome to Coditas family ";
            byte[] b=s.getBytes();
            fout.write(b);
            System.out.println("Writing string into the file");

        }
        else
            System.out.println("File does not exist");
    }
}

/*
output:
Writing string into the file
 */
