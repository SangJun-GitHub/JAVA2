package Input_Output;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by bobsang89@gmail.com on 2019-03-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StringReadWriterEx {
    public static void main(String[] args) {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;

        try{
            while((data = input.read()) != -1)
                output.write(data);                 //void write(int b)
        }catch(IOException e){}

        System.out.println("Input Data : " + inputData);
        System.out.println("Output Data : " + output.toString());
        System.out.println("Output Data : " + output.getBuffer().toString());
    }
}
