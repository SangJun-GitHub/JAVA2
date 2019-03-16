package Input_Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-15
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
//      .\src\Input_Output\FileCopy.java .\src\Input_Output\FileCopy.bak
public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

            int data = 0;
            while((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);               //void write(int b)
            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
