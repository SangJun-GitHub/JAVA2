package Input_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader(".\\src\\Input_Output\\BufferedReaderEx1.java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            for(int i = 1; (line = bufferedReader.readLine()) != null; i++){
                if(line.indexOf(";") != -1)
                    System.out.println(i + ":"+ line);
            }
            bufferedReader.close();
        }catch(IOException e){}
    }
}
