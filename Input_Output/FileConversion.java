package Input_Output;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-18
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class FileConversion {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader(args[0]);
            FileWriter fileWriter = new FileWriter(args[1]);

            int data = 0;
            while((data = fileReader.read()) != -1){
                if(data!='\t' && data != '\n'&& data != ' '&& data != '\r')
                    fileWriter.write(data);
            }

            fileReader.close();
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
