package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bobsang89@gmail.com on 2019-03-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class InputStreamReaderEx {
    public static void main(String[] args) {
        String line = "";

        try{
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            System.out.println("The encoding of your OS : " + inputStreamReader.getEncoding());

            do{
                System.out.print("Enter a sentence. If you want to exit enter \"q\".>");
                line = bufferedReader.readLine();
                System.out.println("Entered sentence : " + line);
            }while(!line.equalsIgnoreCase("q"));

            bufferedReader.close();
            System.out.println("Exited");
        }catch(IOException e){}
    }
}
