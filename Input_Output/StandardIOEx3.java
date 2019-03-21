package Input_Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by bobsang89@gmail.com on 2019-03-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream printStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("test.txt");
            printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
        }catch(FileNotFoundException e){
            System.err.println("File not found.");
        }

        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
