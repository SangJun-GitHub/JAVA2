package Input_Output;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileReaderEx1 {
    public static void main(String[] args) {
        try{
            String fileName = "test.txt";
            FileInputStream fileInputStream = new FileInputStream(fileName);
            FileReader fileReader = new FileReader(fileName);

            int data = 0;
            while((data = fileInputStream.read()) != -1)
                System.out.print((char)data);
            System.out.println();
            fileInputStream.close();

            while((data = fileReader.read()) != -1)
                System.out.print((char)data);
            System.out.println();
            fileReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
