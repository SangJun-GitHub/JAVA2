package Input_Output;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by bobsang89@gmail.com on 2019-03-16
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class DataInputStreamEx1 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("sample.dat");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readBoolean());

            dataInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
