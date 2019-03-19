package Input_Output;

import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-19
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class StandardIOEx1 {
    public static void main(String[] args) {
        try{
            int input = 0;

            while((input=System.in.read()) != -1)
                System.out.println("input : " + input + ", (char)input : " + (char)input);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
// for exit this program Windows : Ctrl + z
// for exit this program Macintosh : Ctrl + d