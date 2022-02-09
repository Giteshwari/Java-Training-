package JavaSession16;
import java.io.*;

public class FileMergeIntoThirdFile
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("src/JavaSession16/newFile.txt");
        BufferedReader br = new BufferedReader(new FileReader("src/JavaSession16/a1.txt"));

        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("src/JavaSession16/Abcd.txt"));

        line = br.readLine();


        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();
        br.close();
        pw.close();

        System.out.println("Merged a1.txt and Abcd.txt into newfile.txt");

    }
}

/*
output:
Merged a1.txt and Abcd.txt into newfile.txt

File Created : newFile.txt
(Everything will be printed in the newFile.txt)
Giteshwari here, welcome all
A ,Hello there, Welcome to Coditas family


 */