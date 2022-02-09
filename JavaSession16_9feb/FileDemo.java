package JavaSession16;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String args[]) throws IOException {

        File f=new File("src/JavaSession16/FileDemo.java");
        if(f.exists()){
            System.out.println("File Exists");
            System.out.println("File path 1 is::"+f.getAbsolutePath());
            System.out.println("File path 2 is::"+f.getPath());
            System.out.println("File name is::"+f.getName());
            System.out.println("File parent is::"+f.getParent());
            System.out.println("File Parent is::"+f.getParentFile());
            System.out.println("File property:read=="+f.canRead());
            System.out.println("file property:write=="+f.canWrite());
            System.out.println("File property:execute=="+f.canExecute());
            System.out.println("Canonical path of file: "+f.getCanonicalPath());
            System.out.println("Length of given file is: "+f.length());
        }
        else
            System.out.println("File Does not exists");
    }
}
/*
output:
File Exists
File path 1 is::C:\Users\Coditas\IdeaProjects\JavaTraining\src\JavaSession16\FileDemo.java
File path 2 is::src\JavaSession16\FileDemo.java
File name is::FileDemo.java
File parent is::src\JavaSession16
File Parent is::src\JavaSession16
File property:read==true
file property:write==true
File property:execute==true
Canonical path of file: C:\Users\Coditas\IdeaProjects\JavaTraining\src\JavaSession16\FileDemo.java
Length of given file is: 1102

 */