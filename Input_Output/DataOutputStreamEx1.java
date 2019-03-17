package Input_Output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DataOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;

        try{
            fileOutputStream= new FileOutputStream("sample.dat");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(10);
            dataOutputStream.writeFloat(20.0f);
            dataOutputStream.writeBoolean(true);

            dataOutputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

