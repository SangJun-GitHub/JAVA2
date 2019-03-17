package Input_Output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("123.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 5);
            for(int i = '1'; i <= '9'; i++){
                bufferedOutputStream.write(i);
            }
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
