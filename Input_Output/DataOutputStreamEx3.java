package Input_Output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-17
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DataOutputStreamEx3 {
    public static void main(String[] args) {
        int[] score = {100, 90, 95, 85, 50};

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("score.dat");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            for(int i = 0; i < score.length; i ++)
                dataOutputStream.writeInt(score[i]);

            dataOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
