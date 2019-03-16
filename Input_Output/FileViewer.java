package Input_Output;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-15
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
//      .\src\Input_Output\FileViewer.java
public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int data = 0;

        while((data = fileInputStream.read()) != -1){
            char c = (char)data;
            System.out.print(c);
        }
    }
}
